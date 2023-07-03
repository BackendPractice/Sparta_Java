package Week_05.thread;

public class TestRunnable implements Runnable{
    @Override
    public void run() {
        // 쓰레드에서 수행할 작업
        System.out.println("러너블 테스트");
    }
}
