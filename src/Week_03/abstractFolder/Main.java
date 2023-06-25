package Week_03.abstractFolder;
public class Main {
    public static void main(String[] args) {
        Car car1 = new BenzCar();
        car1.horn();  // Benz 빵빵
        System.out.println();

        Car car2 = new AudiCar();
        car2.horn();  // Audi 빵빵
        System.out.println();

        Car car3 = new ZenesisCar();
        car3.horn();  // Zenesis 빵빵
    }
}
