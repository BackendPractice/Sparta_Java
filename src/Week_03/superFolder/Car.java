package Week_03.superFolder;

public class Car {
    String model; // 자동차 모델
    String color; // 자동차 색상

    double speed;  // 자동차 속도 , km/h


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public void horn() {
        System.out.println("빵빵");
    }

}
