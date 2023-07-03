package Week_05.thread;

// 1. Thread 클래스를 상속받는 방법
public class TestThread extends Thread {
    @Override
    public void run() {
        // 쓰레드에서 수행할 작업
        System.out.println("쓰레드 테스트");
    }
}
