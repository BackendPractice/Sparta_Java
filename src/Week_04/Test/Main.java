package Week_04.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // 메서드 호출
        System.out.println("main.getClass() = " + main.getNumber());  // main.getNumber() = 2
        System.out.println("main.getClass() = " + main.getNumber());  // main.getNumber() = 2
        System.out.println("main.getClass() = " + main.getNumber());  // main.getNumber() = 2
    }

    public int getNumber() {
        // 지역 변수
        int number = 1;
        number += 1;
        return number;
    }
}
