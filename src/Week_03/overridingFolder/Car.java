package Week_03.overridingFolder;

public class Car {
    double speed;  // 자동차 속도 , km/h

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public void horn() {
        System.out.println("빵빵");
    }

}
