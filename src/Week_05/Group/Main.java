package Week_05.Group;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            // group1에 속한 쓰레드에 interrupt가 발생하지 않았을때 실행
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    // 현재 쓰레드를 1초동안 일시정지 시킨다.
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " Interrupted");
        };

        // ThreadGroup 객체 생성
        ThreadGroup group1 = new ThreadGroup("Group1");

        // Thread 객체 생성시 첫번째 매개변수 전달
        // Thread(ThreadGroup group, Runnable target, String name)
        Thread thread1 = new Thread(group1, task, "Thread 1");
        Thread thread2 = new Thread(group1, task, "Thread 2");

        // Thread에 ThreadGroup 이 할당된것을 확인
        System.out.println("Group of thread1 : " + thread1.getThreadGroup().getName());  // Group of thread1 : Group1
        System.out.println("Group of thread2 : " + thread2.getThreadGroup().getName());  // Group of thread2 : Group1

        thread1.start();
        thread2.start();

        try {
            // 현재 쓰레드를 5초동안 일시정지 시킨다.
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 쓰레드에 interrupt를 가한 게 아니라, 그룹에 interrupt를 가했다.
        // group1에 속한 쓰레드를 실행대기 상태로 바꾼다.
        group1.interrupt();
    }
}


// 순서가 뒤죽박죽으로 출력된다.
// Group of thread1 : Group1
// Group of thread2 : Group1
// Thread 2
// Thread 1
// Thread 2
// Thread 1
// Thread 2
// Thread 1
// Thread 2
// Thread 1
// Thread 2 Interrupted
// Thread 1 Interrupted