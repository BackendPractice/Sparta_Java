package calculation;

// 메인 클래스
public class Video_01 {
    // 메인 메소드
    public static void main(String[] args) {
        // 산술 연산
        // 우선순위 연산
        System.out.println(2 + 2 * 2);  // 6
        System.out.println((2 + 2) * 2);  // 8
        System.out.println("-----------------");

        // 변수를 이용한 연산
        int x = 5;
        float y = 23.001f;
        float z = x + y;

        System.out.println("z: " + z);  // z: 28.001
    }
}
