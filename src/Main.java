import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 클래스 생성

        char letter = sc.nextLine().charAt(0);  // 문자 입력 - 첫번째 문자만 받음
        int ascilNum = (int)letter;  // 정수 변환

        System.out.println(ascilNum);
    }
}