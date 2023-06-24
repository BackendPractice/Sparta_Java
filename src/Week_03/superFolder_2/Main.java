package Week_03.superFolder_2;

public class Main {
    public static void main(String[] args) {
        // 자식 클래스 스포츠카 객체를 생성합니다.
        SportsCar sportsCar = new SportsCar("Lamborghini", "Red", 400000000, "V12");
        sportsCar.brakePedal();  // 스포츠카에 브레이크란 없다
        sportsCar.horn();  // 엔진 V12 부앙~

        // 자식 클래스의 생성자를 통해 부모 클래스의 생성자가 호출되어 필드값이 초기화 되었는지 확인
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());  // sportsCar.getModel() = Lamborghini
        System.out.println("sportsCar.getColor() = " + sportsCar.getColor());  // sportsCar.getColor() = Red
        System.out.println("sportsCar.getPrice() = " + sportsCar.getPrice());  // sportsCar.getPrice() = 4.0E8
    }
}