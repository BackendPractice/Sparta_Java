package Week_03.superFolder_2;
public class Car {
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public void horn() {
        System.out.println("빵빵");
    }

}

