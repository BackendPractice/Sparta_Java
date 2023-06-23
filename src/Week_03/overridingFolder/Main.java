package Week_03.overridingFolder;

public class Main {
    public static void main(String[] args) {
        // 부모 클래스 자동차 객체 생성
        Car car = new Car();
        car.horn();   // 빵빵

        System.out.println();
        // 자식 클래스 스포츠카 객체 생성
        SportsCar sportsCar = new SportsCar("Orion");

        // 오버라이딩한 brakePedal(), horn() 메서드 호출
        sportsCar.brakePedal();  // 스포츠카에 브레이크란 없다
        sportsCar.horn();  // 엔진 Orion 부앙~
    }
}
