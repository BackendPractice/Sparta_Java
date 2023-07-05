package Week_05.join;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000);  // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread");

        thread.start();

        // 현재 시간 구하기
        long start = System.currentTimeMillis();

        // main 쓰레드가 thread의 작업이 끝날때까지 기다린다.
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력된다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));  // 소요시간 = 5006
    }
}
