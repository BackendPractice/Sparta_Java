package calculation;

public class Video_04 {
    public static void main(String[] args) {
        // 형변환 연산자
        int intNum = 20 + (int)8.88;
        System.out.println(intNum);

        double doubleNum = (double)20 + 8.8;
        System.out.println(doubleNum);

        // 삼항 연산자
        int x =20;
        int y = 8;

        boolean isFalse = (x==y) ? true : false;
        boolean isTrue = (x!=y) ? true : false;
        System.out.println(isFalse);
        System.out.println(isTrue);

        // instance of : 객체가 특정 클래스의 인스턴스인지 확인
    }
}
