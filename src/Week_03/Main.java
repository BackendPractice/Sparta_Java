package Week_03;

public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        Car grandeur = new Car();
        Car avante = new Car();
        Car ioniq = new Car();
        Car genesis = new Car();

        // 객체 배열
        Car[] carArray = new Car[4];

        // 메소드 실행, 배열 할당
        grandeur.changeGear('P');
        carArray[0] = grandeur;

        avante.changeGear('R');
        carArray[1] = avante;

        ioniq.changeGear('Q');
        carArray[2] = ioniq;

        genesis.changeGear('D');
        carArray[3] = genesis;

        // 아이템의 필드 출력
        for (Car car: carArray) {
            System.out.println("car.gear = " + car.gear);
        }
    }
}
