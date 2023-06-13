import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner 클래스 생성

        // 입력값 받기
        String title = sc.nextLine();
        float floatRating = sc.nextFloat();
        sc.nextLine();  // 개행 문자 소비
        String recipe_1 = sc.nextLine();
        String recipe_2 = sc.nextLine();
        String recipe_3 = sc.nextLine();

        int intRating = (int)floatRating;  // 강제 형 변환

        // 출력하기
        System.out.println("[" + title + "]");
        System.out.println(intRating  + "(" + intRating*100/5.0 + "%)");  // 자동 형 변환
        System.out.println("1. " + recipe_1);
        System.out.println("2. " + recipe_2);
        System.out.println("3. " + recipe_3);
    }
}