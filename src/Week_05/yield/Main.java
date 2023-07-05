package Week_05.yield;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    // run 도중 interrupt가 발생했기 때문에 catch문이 실행된다.
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                // 쓰레드 양보하기
                Thread.yield();
            }
        };

        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt();

    }
}

// thread2
// thread1
// thread2
// thread1
// thread2
// thread1
// thread2
// thread1
//java.lang.InterruptedException: sleep interrupted
//        at java.base/java.lang.Thread.sleep(Native Method)
//        at Week_05.yield.Main.lambda$main$0(Main.java:8)
//        at java.base/java.lang.Thread.run(Thread.java:833)
// thread2
// thread2
// thread2
// thread2
// thread2
// thread2
