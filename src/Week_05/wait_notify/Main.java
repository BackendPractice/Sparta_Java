package Week_05.wait_notify;

import java.util.List;
import java.util.ArrayList;

// 점원과 고객이 이용하는 서비스
// 점원이 재고 상품을 쌓아놓고(최대 5개)
// 손님들이 쌓아 놓은것 중에서 구입할 수 있다.
public class Main {
    public static String[] itemList = {
            "MacBook", "IPhone", "AirPods", "iMac", "Mac mini"
    };
    public static AppleStore appleStore = new AppleStore();
    public static final int MAX_ITEM = 5;

    public static void main(String[] args) {

        // 점원 Runnable
        Runnable StoreClerk = () -> {
            while (true) {
                int randomItem = (int) (Math.random() * MAX_ITEM);  // 0 ~ 4의 정수 중, 랜덤한 값을 뽑아냄
                appleStore.restock(itemList[randomItem]);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignored) {
                }
            }
        };

        // 고객 Runnable
        Runnable Customer = () -> {
            while (true) {
                try {
                    Thread.sleep(77);
                } catch (InterruptedException ignored) {
                }

                int randomItem = (int) (Math.random() * MAX_ITEM);  // 0 ~ 4의 정수 중, 랜덤한 값을 뽑아냄
                appleStore.sale(itemList[randomItem]);
                System.out.println(Thread.currentThread().getName() + " Purchase Item " + itemList[randomItem]);
            }
        };

        // 쓰레드 실행
        new Thread(StoreClerk, "StoreClerk").start();
        new Thread(Customer, "Customer1").start();
        new Thread(Customer, "Customer2").start();

    }
}

class AppleStore {
    private List<String> inventory = new ArrayList<>();

    // 재고를 넣는 메서드
    public void restock(String item) {
        synchronized (this) {
            // 재고가 5개 이상인 경우
            while (inventory.size() >= Main.MAX_ITEM) {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                try {
                    wait();  // 재고가 꽉 차있어서 재입고하지 않고 기다린다.
                    Thread.sleep(333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            inventory.add(item);  // 재입고
            notify();  // 재입고 되었음을 고객에게 알려준다.
            System.out.println("Inventory 현황: " + inventory.toString());
        }
    }

    // 판매하는 메서드
    public synchronized void sale(String itemName) {
        // 재고가 0개인 경우
        while (inventory.size() == 0) {
            System.out.println(Thread.currentThread().getName() + " Waiting!");
            try {
                wait();  // 재고가 없기 때문에 고객은 기다린다.
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            // 고객이 찾는 제품이 있는지 확인
            for (int i = 0; i < inventory.size(); i++) {
                // 고객이 찾는 제품이 있는 경우
                if (itemName.equals(inventory.get(i))) {
                    inventory.remove(itemName);
                    notify();  // 제품 하나 팔렸으니 재입고 하라고 알려준다.
                    return;  // 메서드 종료
                }
            }

            // 고객이 찾는 제품이 없을 경우
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                wait();  // 고객이 찾는 제품이 없기 때문에 고객은 기다린다.
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

// Inventory 현황: [Mac mini]
// Inventory 현황: [Mac mini, IPhone]
// Customer2 Waiting!
// Customer1 Purchase Item IPhone
// Inventory 현황: [Mac mini, Mac mini]
// Customer2 Waiting!
// Customer1 Waiting!
// Inventory 현황: [Mac mini, Mac mini, iMac]
// Customer2 Waiting!
// Inventory 현황: [Mac mini, Mac mini, iMac, Mac mini]
// Customer1 Waiting!
// Inventory 현황: [Mac mini, Mac mini, iMac, Mac mini, MacBook]
// Customer2 Waiting!
// StoreClerk Waiting!

// 병목현상 발생 : 고객도 기다리고, 점원도 기다리고 있는 상황
