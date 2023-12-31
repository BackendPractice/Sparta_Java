package Week_03;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();  // 타이어가 생성되었습니다.
                              // 자동차가 생성되었습니다.

        // 메서드 호출
        car.gasPedal(100 , 'D');
        System.out.println("car.speed: " + car.speed);  // car.speed: 100.0
        System.out.println("car.gear: " + car.gear);  // car.gear: D
        System.out.println("-----------");

        System.out.println("car.lights: " + car.lights);  // car.lights: true
        car.onOffLight();
        System.out.println("car.lights: " + car.lights);  // car.lights: false
        System.out.println("-----------");

        // 메서드 호출 및 리턴값 저장
        double speed = car.gasPedal(0 , 'P');
        System.out.println("speed: " + speed);  // speed: 0.0
        System.out.println("car.speed: " + car.speed);  // car.speed: 0.0
        System.out.println("car.gear: " + car.gear);  // car.gear: P
        System.out.println("-----------");

        boolean light =  car.onOffLight();
        System.out.println("light: " + light);  // light: true
        System.out.println("car.lights: " + car.lights);  // car.lights: true
        System.out.println("-----------");

        // 가변길이 매개변수 메서드 호출
        car.carSpeeds(100, 200);  // 속도 : 100.0
                                  // 속도 : 200.0

        car.carSpeeds(100, 200, 300);  // 속도 : 100.0
                                       // 속도 : 200.0
                                       // 속도 : 300.0
    }
}
