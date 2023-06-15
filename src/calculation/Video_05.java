package calculation;

public class Video_05 {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // 비교연산자 -> 논리 연산자
        System.out.println(result); // true

        result = x + 10 < y && y < z; // 산술연산자 -> 비교연산자 -> 논리 연산자
        System.out.println(result); // false

        result = x + 2 * 3 > y; // 산술연산자 곱셈 -> 산술연산자 덧셈 -> 비교연산자
        System.out.println(result); // false (8>9)

        result = (x + 2) * 3 > y; // 괄호안 산술연산자 덧셈 -> 괄호 밖 산술연산자 곱셈 -> 비교연산자
        System.out.println(result); // true (12>9)
    }
}
