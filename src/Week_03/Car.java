package Week_03;

public class Car {
    // 필드
    // 고유 데이터
    String company;
    String model = "GV80";  // 초기화
    String color;
    double price;

    // 상태 데이터
    double speed;
    char gear;
    boolean lights = true;  // 초기화

    // 객체 데이터
    Tire tire = new Tire();  // 초기화
    Door door;
    Handle handle;

    // 생성자
    public Car () {
        System.out.println("자동차가 생성되었습니다.");
    }

    // 메서드
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    double breakPedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char gearType) {
        gear = gearType;
        return gear;
    }

    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵 빵 ~");
    }
}
