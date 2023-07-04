package Week_05.User;

public class Main {
    public static void main(String[] args) {
        Runnable user = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(i+1 + "번째 user");
            }
        };

        Thread userThread = new Thread(user);
        userThread.setName("userThread");

        userThread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i+1 + "번째 main");
        }
    }
}
