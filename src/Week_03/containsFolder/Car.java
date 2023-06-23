package Week_03.containsFolder;

public class Car {

    static final String company = "GENESIS"; // 자동차 회사
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    Tire[] tire;
    Door[] door;
    Handle handle;

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void setTire(Tire ... tire) {
        this.tire = tire;
    }

    public void setDoor(Door ... door) {
        this.door = door;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }
}
