package Week_03.extendsFolder;

public class Main {
    public static void main(String[] args) {
        // 부모 클래스 객체에서 자식 클래스 멤버 사용
        Car car = new Car();
        // car.engine = "Orion"; // 에러
        // car.booster(); // 에러

        // 자식 클래스 객체 생성
        SportsCar sportsCar = new SportsCar();
        sportsCar.engine = "Orion";
        sportsCar.booster();  // 엔진 Orion 부앙~

        // 자식 클래스 객체에서 부모 클래스 멤버 사용
        // 직접 수정, 조회
        sportsCar.company = "GENESIS";
        System.out.println("sportsCar.company = " + sportsCar.company);  // sportsCar.company = GENESIS

        // 간접 수정, 조회
        sportsCar.setModel("GV80");
        System.out.println("sportsCar.getModel() = " + sportsCar.getModel());  // sportsCar.getModel() = GV80

        sportsCar.horn();  // 빵빵
        System.out.println(sportsCar.changeGear('D'));  // D
    }
}
