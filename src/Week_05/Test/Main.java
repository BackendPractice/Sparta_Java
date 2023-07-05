package Week_05.Test;

// Main.java

public class Main {
    public static void main(String[] args) {
        Car car1 = new BenzCar();
        car1.horn();  // Benz 빵빵

        Car car2 = new AudiCar();
        car2.horn();  // Audi 빵빵

        Car car3 = new GenesisCar();
        car3.horn();  // Genesis 빵빵
    }
}