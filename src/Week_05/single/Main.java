package Week_05.single;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("싱글 쓰레드 테스트");
            System.out.println(Thread.currentThread().getName());
        };

        Thread singleThread = new Thread(task);
        singleThread.setName("singleThread");

        singleThread.start();
        System.out.println(Thread.currentThread().getName());  // main
    }
}
