package Week_03.abstractFolder;

public abstract class Car {
    String company; // 자동차 회사
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    // 추상 메서드
    public abstract void horn();
}
