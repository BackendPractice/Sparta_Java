package Week_03.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // 고래는 포유류이기 때문에 포유류 타입으로 변환될 수 있다.
        Mammal mammal = new Whale();

        // 하지만 포유류 전부가 바다에 살고 수영을 할 수 있는 것은 아니기 때문에
        // 수영 하다 메서드는 실행입 불가하다.
        // 즉, 부모 클래스에 swimming이 선언되어있지 않아서 사용 불가능하다.
        // mammalia.swimming();  // 에러 발생

        // 반대로 모든 포유류가 전부 고래 처럼 수영이 가능한 것이 아니기 때문에 타입변환이 불가능하다.
        // 즉, 부모타입의 객체는 자식타입의 변수로 변환될 수 없다.
        // Whale whale = new Mammal();  // 에러 발생

        mammal.feeding();  // 고래는 모유수유를 합니다.
    }
}
