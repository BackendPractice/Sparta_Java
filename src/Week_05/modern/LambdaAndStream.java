package Week_05.modern;

import java.util.ArrayList;
import java.util.List;

// 주차장
// 티켓, 파킹머니가 있는 자동차만 주차 가능
public class LambdaAndStream {
    public static void main(String[] args) {
        // 주차대상 차량
        ArrayList<Car> carsWantToPark = new ArrayList<>();

        // 주차장
        ArrayList<Car> parkingLot = new ArrayList<>();

        // 주말 주차장
        ArrayList<Car> weekendParkingLot = new ArrayList<>();

        // 자동차 인스턴스 객체 생성
        Car car1 = new Car("Benz", "Class E", true, 0);
        Car car2 = new Car("BMW", "Series 7", false, 100);
        Car car3 = new Car("BMW", "X9", false, 0);
        Car car4 = new Car("Audi", "A7", true, 0);
        Car car5 = new Car("Hyundai", "Ionic 6", false, 10000);

        carsWantToPark.add(car1);
        carsWantToPark.add(car2);
        carsWantToPark.add(car3);
        carsWantToPark.add(car4);
        carsWantToPark.add(car5);

        // 람다함수 적용
        parkingLot.addAll((parkCars(carsWantToPark, (Car car) -> car.hasParkingTicket() && car.getParkingMoney() > 1000)));

//      parkingLot.addAll(parkingCarWithTicket(carsWantToPark));
//      parkingLot.addAll(parkingCarWithMoney(carsWantToPark));
        parkingLot.addAll(parkCars(carsWantToPark, Car :: hasTicket));
        parkingLot.addAll(parkCars(carsWantToPark, Car :: noTicketButMoney));

        for (Car car : parkingLot) {
            System.out.println("Parked Car : " + car.getCompany() + "-" + car.getModel());
        }
        // Parked Car : Benz-Class E
        // Parked Car : Audi-A7
        // Parked Car : Hyundai-Ionic 6
    }

    // 티켓이 있는지 확인하는 메서드
//    public static List<Car> parkingCarWithTicket(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (car.hasParkingTicket()) {
//                cars.add(car);
//            }
//        }
//        return cars;
//    }

    // 파킹머니가 있는지 확인하는 메서드
//    public static List<Car> parkingCarWithMoney(List<Car> carsWantToPark) {
//        ArrayList<Car> cars = new ArrayList<>();
//
//        for (Car car : carsWantToPark) {
//            if (!car.hasParkingTicket() && car.getParkingMoney() > 1000) {
//                cars.add(car);
//            }
//        }
//        return cars;
//    }

    // 티켓과 파킹머니가 있는지 확인하는 메서드
    public static List<Car> parkCars(List<Car> carsWantToPark, Predicate<Car> function) {
        List<Car> cars = new ArrayList<>();

        for (Car car : carsWantToPark) {
            if (function.test(car)) {
                cars.add(car);
            };
        }

        return cars;
    };
}


