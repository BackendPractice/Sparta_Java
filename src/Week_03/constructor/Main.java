package Week_03.constructor;

public class Main {
    public static void main(String[] args) {

        // 기본 생성자 호출 오류 확인
        // Car car1 = new Car(); // 오류 발생

        // 생성자 오버로딩을 통해 여러 상황에서 자동차 생산
        // 제네시스 자동차를 생산 : static final String COMPANY = "GENESIS"; 상수 고정
        // 모든 자동차는 생산시 기어의 최초 상태 'P' 로 고정 : char gear = 'P'; 직접 대입하여 초기화

        // GV60 모델만 기본으로 선택
        Car car2 = new Car("GV60");  // 첫번째 생성자가 호출되었습니다.
        System.out.println("car2.model = " + car2.model);  // car2.model = GV60
        System.out.println("car2.color = " + car2.color);  // car2.color = null
        System.out.println("car2.price = " + car2.price);  // car2.price = 0.0
        System.out.println("car2.gear = " + car2.gear + "\n");  // car2.gear = P

        // GV70 모델, 색상 Blue 만 기본으로 선택
        Car car3 = new Car("GV70", "Blue");  // 두번째 생성자가 호출되었습니다.
        System.out.println("car3.model = " + car3.model);  // car3.model = GV70
        System.out.println("car3.color = " + car3.color);  // car3.color = Blue
        System.out.println("car3.price = " + car3.price);  // car3.price = 0.0
        System.out.println("car3.gear = " + car3.gear + "\n");  // car3.gear = P

        // GV80 모델, 색상 Black, 가격 50000000 으로 완전하게 고정된 경우
        Car car4 = new Car("GV80", "Black", 50000000);  // 세번째 생성자가 호출되었습니다.
        System.out.println("car4.model = " + car4.model);  // car4.model = GV80
        System.out.println("car4.color = " + car4.color);  // car4.color = Black
        System.out.println("car4.price = " + car4.price );  // car4.price = 5.0E7
        System.out.println("car4.gear = " + car4.gear + "\n");  // car4.gear = P

    }
}
