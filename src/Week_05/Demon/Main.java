package Week_05.Demon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(i+1 + "번째 demon");
            }
        };

        Thread demonThread = new Thread(demon);
        demonThread.setDaemon(true);  // true로 설정시 데몬스레드로 실행됨

        demonThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i+1 + "번째 main");
        }
    }
}
