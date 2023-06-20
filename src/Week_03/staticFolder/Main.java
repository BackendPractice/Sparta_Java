package Week_03.staticFolder;

public class Main {
    public static void main(String[] args) {
        // 클래스 이름으로 접근
        // 클래스 필드 확인
        System.out.println(Car.company);  // GENESIS
        // 클래스 필드 변경 및 확인
        Car.company = "Audi";
        System.out.println(Car.company);  // Audi

        // 클래스 메서드 호출
        String companyName = Car.setCompany("Benz");
        System.out.println("companyName = " + companyName);  // companyName = Benz

        // 참조형 변수로 접근
        Car car = new Car(); // 객체 생성
        car.company = "Ferrari";
        System.out.println(car.company);  // Ferrari

        String companyName_2 = car.setCompany("Lamborghini");
        System.out.println("companyName_2 = " + companyName_2);  // companyName_2 = Lamborghini
    }
}
