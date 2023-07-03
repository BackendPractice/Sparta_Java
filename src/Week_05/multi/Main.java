package Week_05.multi;

public class Main {
    public static void main(String[] args) {
        Runnable task_1 = () -> {
            System.out.println("멀티 쓰레드 테스트_1");
            System.out.println(Thread.currentThread().getName());
        };

        Runnable task_2 = () -> {
            System.out.println("멀티 쓰레드 테스트_2");
            System.out.println(Thread.currentThread().getName());
        };

        Thread multiThread_1 = new Thread(task_1);
        multiThread_1.setName("multiThread_1");

        Thread multiThread_2 = new Thread(task_2);
        multiThread_2.setName("multiThread_2");

        // 순서가 뒤죽박죽으로 출력된다.
        // 두 개의 쓰레드가 서로 번갈아가면서 실행되기 때문이다(멀티 쓰레드).
        // 두 개의 쓰레드의 실행 순서나 실행 시간은 운영체제의 스케줄러가 처리하기 때문에 알 수 없다.

        multiThread_1.start();
        multiThread_2.start();
        System.out.println(Thread.currentThread().getName());

        // main
        // 멀티 쓰레드 테스트_2
        // multiThread_2
        // 멀티 쓰레드 테스트_1
        // multiThread_1
    }
}
