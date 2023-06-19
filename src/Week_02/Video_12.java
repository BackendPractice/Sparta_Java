package Week_02;

import java.util.Scanner;

public class Video_12 {
    public static void main(String[] args) {
        // 입력 받는 단만 출력
        Scanner sc = new Scanner(System.in);  // Scanner 클래스 생성

        System.out.println("원하는 단을 입력해주세요");
        int num = sc.nextInt();

        // 구구단
        for (int i=2; i < 10; i++) {
            // 입력 받은 단만 출력
            if (i == num) {
                for (int j=1; j<10; j++) {
                    System.out.println("i*j = " + i*j);
                }
            }
        }
    }
}
