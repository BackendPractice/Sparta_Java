import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 변수 선언
        final boolean isClickBtn = false;

        char alphavbet = 'A';  // 문자형은 작은따옴표('')로 할당 해야한다.

        byte byteNum = 127;  // 1byte
        short shortNum = 32767; // 2byte
        int intNum = 2147483647;  // 4byte
        long longNum = 2147483647L;  // 8byte

        float floatNum = 2.2F;  // 4byte
        double doubleNum = 2.2;  // 8byte

        System.out.println(isClickBtn);
        System.out.println(alphavbet);
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);

        String sayHello = "Hello JAVA";  // 문자열
        int[] intArray = {1,2,3};  // 배열
        System.out.println(sayHello);
        System.out.println(intArray);  // 주소값 출력
        System.out.println(Arrays.toString((intArray)));  // 주소값을 배열로 출력

        // 래퍼 클래스
        int myAge = 28;
        Integer age = myAge;  // 박싱
        System.out.println(age.intValue());  // 언박싱
    }
}