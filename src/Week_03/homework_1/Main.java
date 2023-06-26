package Week_03.homework_1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double plusResult = calculator.calculate("더하기", 3, 3);
        System.out.println(plusResult);  // 6.0

        double minuseResult = calculator.calculate("빼기", 3, 3);
        System.out.println(minuseResult);  // 0.0

        double divisionResult = calculator.calculate("나누기", 3, 3);
        System.out.println(divisionResult);  // 1.0

        double MultiplicationResult = calculator.calculate("곱하기", 3, 3);
        System.out.println(MultiplicationResult);  // 9.0

        double ErrorResult = calculator.calculate("인사하기", 3, 3);
        System.out.println(ErrorResult);  // 0.0
    }
}
