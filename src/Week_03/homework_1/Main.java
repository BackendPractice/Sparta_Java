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

        double multiplicationResult = calculator.calculate("곱하기", 3, 3);
        System.out.println(multiplicationResult);  // 9.0

        double remainderResult = calculator.calculate("나머지", 3, 3);
        System.out.println(remainderResult);  // 0.0

        double ErrorResult = calculator.calculate("인사하기", 3, 3);
        System.out.println(ErrorResult);  // 0.0
    }
}
