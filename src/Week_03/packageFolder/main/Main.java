package Week_03.packageFolder.main;

import Week_03.packageFolder.pk1.Car;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car();  // 같은 패키지에 있는 클래스가 아니기 때문에 가져올 수 없다.

        Car car1 = new Car();
        Week_03.packageFolder.pk2.Car car2 = new Week_03.packageFolder.pk2.Car();

        car1.horn();  // pk1 빵빵
        car2.horn();  // pk2 빵빵
    }
}
