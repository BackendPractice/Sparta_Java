import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 정수를 실수로 형 변환하는 예제
        int intNum = 10;

        double doubleNum = (double)intNum;
        float floatNum = (float)intNum;

        System.out.println("intNum: " + intNum);
        System.out.println("doubleNum: " + doubleNum);
        System.out.println("floatNum: " + floatNum);
    }
}