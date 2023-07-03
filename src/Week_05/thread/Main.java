package Week_05.thread;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("람다식 러너블 테스트");
            System.out.println(Thread.currentThread().getName());
        };

        Thread thread_1 = new Thread(task);
        thread_1.setName("thread_1");

        Thread thread_2 = new Thread(task);
        thread_2.setName("thread_2");

        // 순서가 뒤죽박죽으로 출력된다.
        thread_1.start();  // 람다식 러너블 테스트
        // thread_1

        thread_2.start();  // 람다식 러너블 테스트
        // thread_2
    }
}
