package Week_03.constructor;

public class Car {
    // 필드
    static final String COMPANY = "GENESIS"; // 자동차 회사 : GENESIS
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    char gear = 'P'; // 기어의 상태, P,R,N,D

    // 생성자
    public Car(String modelName) {
        System.out.println("첫번째 생성자가 호출되었습니다.");
        model = modelName;
    }

    public Car(String modelName, String colorName) {
        System.out.println("두번째 생성자가 호출되었습니다.");
        model = modelName;
        color = colorName;
    }

    public Car(String modelName, String colorName, double priceValue) {
        System.out.println("세번째 생성자가 호출되었습니다.");
        color = colorName;
        price = priceValue;
    }

    // 메서드
    // ···
}