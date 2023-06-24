package Week_03.Polymorphism_2;

public class Main {
    public static void main(String[] args) {
        // 자동 타입변환된 부모타입의 변수의 자식 객체
        Mammal mammal = new Whale();
        mammal.feeding();  // 고래는 모유수유를 합니다.

        // 자식객체 고래의 수영 기능을 사용하고 싶다면
        // 다시 자식타입으로 강제 타입변환을 하면된다.
        Whale whale = (Whale) mammal;
        whale.swimming();  // 수영하다.

        Mammal newMammal = new Mammal();
        // Whale newWhale = (Whale) newMammal;  // 에러 발생
    }
}
