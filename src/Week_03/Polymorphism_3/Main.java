package Week_03.Polymorphism_3;

public class Main {
    public static void main(String[] args) {
        // 강제 형 변환
        Tire hankookSampleTire = new HankookTire("HANKOOK");
        Tire kiaSampleTire = new KiaTire("KIA");

        // 다형성 구현
        Car car1 = new Car(hankookSampleTire);
        Car car2 = new Car(kiaSampleTire);

        // 오버라이딩된 메서드 호출
        car1.tire.rideComfort();  // HANKOOK 타이어 승차감은 100
        car2.tire.rideComfort();  // KIA 타이어 승차감은 60

        // 다형성 구현
        Tire hankookTire = car1.getHankookTire();
        KiaTire kiaTire = (KiaTire) car2.getKiaTire();

        // 오버라이딩된 메서드 호출
        hankookTire.rideComfort();  // HANKOOK 타이어 승차감은 100
        kiaTire.rideComfort();  // KIA 타이어 승차감은 60
    }
}
