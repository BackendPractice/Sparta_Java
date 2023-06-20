package Week_03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();  // 타이어가 생성되었습니다.
                              // 자동차가 생성되었습니다.
        System.out.println("car.model = " + car.model);  // car.model = GV80
        System.out.println("car.color = " + car.color);  // car.color = null
        System.out.println("---------");

        System.out.println("car.speed = " + car.speed);  // car.speed = 0.0
        System.out.println("car.gear = " + car.gear);  // car.gear =  
        System.out.println("car.lights = " + car.lights);  // car.lights = true
        System.out.println("---------");

        System.out.println("car.tire = " + car.tire);  // car.tire = Week_03.Tire@27f674d
        System.out.println("car.door = " + car.door);  // car.door = null
        System.out.println("---------");

        // 필드 사용
        car.color = "blue";
        car.speed = 100;
        car.lights = false;

        System.out.println("car.color = " + car.color);  // car.color = blue
        System.out.println("car.speed = " + car.speed);  // car.speed = 100.0
        System.out.println("car.lights = " + car.lights);  // car.lights = false
    }
}
