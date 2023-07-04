package Week_05.Priority;

public class Main {
    public static void main(String[] args) {
        Runnable task1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };

        Thread thread1 = new Thread(task1);
        thread1.setPriority(8);
        int threadPriority = thread1.getPriority();
        System.out.println("threadPriority = " + threadPriority);  // threadPriority = 8

        Thread thread2 = new Thread(task2);
        thread2.setPriority(2);

        // 순서가 뒤죽박죽으로 출력된다.
        // 우선 순위가 높다고 반드시 쓰레드가 먼저 실행되고, 종료되는 것이 아니다.
        thread1.start();
        thread2.start();
    }
}