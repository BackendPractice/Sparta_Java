import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 암시적 형변환 : 작은 타입의 크기에서 큰 타입의 크기로 이동할때 자동으로 타입 변환이 일어난다.
        // 변수 타입별 크기 순서 : byte(1) => short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        // (1) byte -> int
        byte byteNum = 10;
        int intNum = byteNum;
        System.out.println("intNum: "+ intNum);

        // (2) char -> int
        char charAlphabat = 'A';
        intNum = charAlphabat;
        System.out.println("intNum: "+ intNum);

        // (3) int -> long
        long longNum = intNum;
        System.out.println("longNum: "+ longNum);

        // (4) int -> double
        double doubleNum = intNum;
        System.out.println("doubleNum: "+ doubleNum);
    }
}