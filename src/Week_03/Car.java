package Week_03;

// 클래스
// 1. 클래스 선언
public class Car {
    // 2. 필드 정의
    String company;  // 자동차 회사
    String model;  // 자동차 모델
    String color;  // 자동차 색
    double price;  // 자동차 가격
    double speed;  // 자동차 속도, km/h
    char gear;  // 기어상태(P, R, N, D)
    boolean lights;  // 자동차 조명의 상태

    // 3. 생성자 정의
    public Car () {
        System.out.println("생성자가 호출되었습니다. 인스턴스가 생성되었습니다.");
    }

    // 4. 메서드 정의
    // gasPedal
    // input : km/h(double), output : speed(double)
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    // breakPedal
    // input : x, output : speed(double)
    double breakPedal() {
        speed = 0;
        return speed;
    }

    // changeGear
    // input : gearType(char), output : gear(char)
    char changeGear(char gearType) {
        gear = gearType;
        return gear;
    }

    // onOffLight
    // input : x, output : lights(boolean)
    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    // horn
    // input : x, output : x
    void horn() {
        System.out.println("빵 빵 ~");
    }
}
