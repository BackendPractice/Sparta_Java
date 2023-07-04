package Week_05.status.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // 현재 쓰레드를 2초동안 일시정지 시킨다.
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        try {
            // Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
            // 특정 쓰레드를 지목해서 멈추는 것이 불가능하기 때문에
            // 자동으로 Thread.sleep(1000)으로 변환되었다.
            // 현재 쓰레드를 1초동안 일시정지 시킨다.
            thread.sleep(1000);
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// sleep(1000) : main
// task : Thread
