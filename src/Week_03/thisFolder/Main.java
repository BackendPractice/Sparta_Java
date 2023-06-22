package Week_03.thisFolder;

public class Main {
    public static void main(String[] args) {

        // 생성자 오버로딩을 통해 여러 상황에서 자동차 생산
        // 모델을 변경하면서 만들 수 있고 색상 : Blue, 가격 50000000 고정
        Car car1 = new Car("GV60");
        System.out.println("car1.model = " + car1.model);  // car1.model = GV60
        System.out.println("car1.color = " + car1.color);  // car1.color = Blue
        System.out.println("car1.price = " + car1.price);  // car1.price = 5.0E7
        System.out.println("car1.gear = " + car1.gear + "\n");  // car1.gear = P

        // 모델, 색상을 변경하면서 만들 수 있고 가격 100000000 고정
        Car car2 = new Car("GV70", "Red");
        System.out.println("car2.model = " + car2.model);  // car2.model = GV70
        System.out.println("car2.color = " + car2.color);  // car2.color = Red
        System.out.println("car2.price = " + car2.price);  // car2.price = 1.0E8
        System.out.println("car2.gear = " + car2.gear + "\n");  // car2.gear = P

        // GV80 모델, 색상 Black, 가격 120000000 으로 완전하게 고정된 경우
        Car car3 = new Car("GV80", "Black", 120000000);
        System.out.println("car3.model = " + car3.model);  // car3.model = GV80
        System.out.println("car3.color = " + car3.color);  // car3.color = Black
        System.out.println("car3.price = " + car3.price);  // car3.price = 1.2E8
        System.out.println("car3.gear = " + car3.gear + "\n");  // car3.gear = P

        // this 키워드를 통해 car3 인스턴스 자신을 반환
        // car3.returnInstance() = 인스턴스의 주소
        System.out.println(car3.returnInstance());  // Week_03.thisFolder.Car@1d251891
        System.out.println(car3.returnInstance().model);  // GV80
        System.out.println(car3.returnInstance().color);  // Black
        System.out.println(car3.returnInstance().price);  // 1.2E8
    }
}
