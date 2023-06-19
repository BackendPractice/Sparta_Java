package Week_02;

public class Video_02 {
    public static void main(String[] args) {
        // 비교 연산
        System.out.println(10 > 9);  // true
        System.out.println(10 >= 9);  // ture
        System.out.println(10 < 9);  // false
        System.out.println(10 <= 9);  // false
        System.out.println(10 == 10);  // true
        System.out.println(10 == 9 ); // false
        System.out.println(10 != 10); // false
        System.out.println(10 != 9);  // true
        System.out.println("-----------------------");

        // 논리 연산
        boolean isDone = true;
        boolean isFine = true;
        boolean isFlag = false;

        System.out.println(isDone || isFine || isFlag);
        System.out.println(isDone && isFine && isFlag);
        System.out.println("isDone: " + isDone);
        System.out.println("!isDone: " + !isDone);
    }
}