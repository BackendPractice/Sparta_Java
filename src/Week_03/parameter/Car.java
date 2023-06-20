package Week_03.parameter;

public class Car {

    // 필드
    String company; // 자동차 회사
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    Tire tire;

    // 생성자
    public Car() {}

    // 메서드
    double brakePedal(char type) {
        speed = 0;
        type = 'P';  // type을 'P'로 고정
        changeGear(type);
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    Tire setTire(Tire tireCompany) {
        tireCompany.company = "KIA";  // company를 "KIA"로 고정
        tire = tireCompany;
        return tire;
    }
}