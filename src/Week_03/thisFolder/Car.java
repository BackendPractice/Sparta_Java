package Week_03.thisFolder;

public class Car {

    // 필드
    static final String COMPANY = "GENESIS";  // 상수 초기화
    String model;
    String color;
    double price;
    char gear = 'P';  // 변수 초기화

    // 생성자
    public Car(String model) {
        this(model, "Blue", 50000000);
    }

    public Car(String model, String color) {
        this(model, color, 100000000);
    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // 메서드
    // ···

    Car returnInstance() {
        return this;
    }
}
