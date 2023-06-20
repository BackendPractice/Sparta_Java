package Week_03.parameter;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 객체 생성

        // 기본형 매개변수
        char type = 'D';

        System.out.println("type = " + type);  // type = D

        car.brakePedal(type);

        System.out.println("type = " + type);  // type = D
        System.out.println("gear = " + car.gear);  // gear = P

        // 참조형 매개변수
        Tire tire = new Tire();
        tire.company = "금호";

        System.out.println("tire.company = " + tire.company);  // tire.company = 금호

        Tire carInstanceTire = car.setTire(tire);

        System.out.println("tire.company = " + tire.company);  // tire.company = KIA
        System.out.println("carInstanceTire.company = " + carInstanceTire.company);  // carInstanceTire.company = KIA
    }
}