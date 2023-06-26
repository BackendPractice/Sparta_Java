package Week_03.homework_2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AddOperation addOperation = new AddOperation();
        SubstractOperation substractOperation = new SubstractOperation();
        DivideOperation divideOperation = new DivideOperation();
        MultiplyOperation multiplyOperation = new MultiplyOperation();

        double plusResult = addOperation.addOperation(3, 3);
        System.out.println("더하기 : " + plusResult);  // 더하기 : 6.0

        double minuseResult = substractOperation.substractOperation(3, 3);
        System.out.println("빼기 : " +minuseResult);  // 빼기 : 0.0

        double divisionResult = divideOperation.divideOperation(3, 3);
        System.out.println("나누기 : " +divisionResult);  // 나누기 : 1.0

        double multiplicationResult = multiplyOperation.multiplyOperation(3, 3);
        System.out.println("곱하기 : " +multiplicationResult);  // 곱하기 : 9.0

        double remainderResult = calculator.calculate("나머지", 3, 3);
        System.out.println("나머지 : " +remainderResult);  // 나머지 : 0.0

        double ErrorResult = calculator.calculate("인사하기", 3, 3);  // 입력하신 연산을 수행할 수 없어요
        System.out.println(ErrorResult);  // 0.0
    }
}
