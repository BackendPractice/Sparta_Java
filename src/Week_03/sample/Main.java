package Week_03.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
    }

    // 메서드
    public int getNumber() {
        // 지역변수
        int number = 1;
        number += 1;
        return number;
    }
}
