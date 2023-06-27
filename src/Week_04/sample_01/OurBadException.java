package Week_04.sample_01;

// 예외 클래스를 만들기
public class OurBadException extends Exception {
    // 예외 정의하기
    public OurBadException () {
        super("위험한 행동을 하면 예외처리를 해야함");
    }
}
