import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 실수를 정수로 형 변환하는 예제
        double doubleNum = 10.101010;
        float floatNum = 10.101010f;

        int intNumByDouble = (int)doubleNum;
        int intNumByFloat = (int)floatNum;

        System.out.println(intNumByDouble);
        System.out.println(intNumByFloat);
    }
}