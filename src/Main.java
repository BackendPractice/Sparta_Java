import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);  // Scanner 클래스 생성

       int ascilNum = sc.nextInt();  // 정수 입력
       char ch = (char)ascilNum;  // 문자 변환

        System.out.println(ch);
    }
}