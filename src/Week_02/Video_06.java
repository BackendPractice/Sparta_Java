package Week_02;

public class Video_06 {
    public static void main(String[] args) {
        // 산술변환
        short x = 10;
        int y = 20;

        int z = x + y; // 결과값은 더 큰 표현타입인 int 타입의 변수로만 저장할 수 있습니다.

        long longX = 30L;
        long longZ = z + longX; // 결과값은 더 큰 표현타입인 long 타입의 변수로만 저장할 수 있습니다.

        float floatX = x; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float floatY = y; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.
        float floatZ = z; // 결과값은 더 큰 표현타입인 float 타입의 변수로만 저장할 수 있습니다.

        System.out.println(longX);  // 30
        System.out.println(longZ);  // 60
        System.out.println(floatX);  // 10.0
        System.out.println(floatY);  // 20.0
        System.out.println(floatZ);  // 30.0

        // 비트 연산
        System.out.println(3 << 2);  // 12
        System.out.println(3 >> 1);  // 1
    }
}
