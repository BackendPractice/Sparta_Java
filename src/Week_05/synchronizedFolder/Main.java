package Week_05.synchronizedFolder;

public class Main {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }

        };

        // 3개의 쓰레드를 한 번에 만들어 실행하기
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        // 임계영역 지정
        synchronized (this) {
            if(storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}

// 남은 사과의 수 = 9
// 남은 사과의 수 = 8
// 남은 사과의 수 = 7
// 남은 사과의 수 = 6
// 남은 사과의 수 = 5
// 남은 사과의 수 = 4
// 남은 사과의 수 = 3
// 남은 사과의 수 = 2
// 남은 사과의 수 = 1
// 남은 사과의 수 = 0
// 남은 사과의 수 = 0
// 남은 사과의 수 = 0