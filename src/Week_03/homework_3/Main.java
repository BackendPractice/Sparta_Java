package Week_03.homework_3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        AddOperation addOperation = new AddOperation();
        SubstractOperation substractOperation = new SubstractOperation();
        DivideOperation divideOperation = new DivideOperation();
        MultiplyOperation multiplyOperation = new MultiplyOperation();

        double plusResult = addOperation.operate(3,3);
        System.out.println("더하기 : " + plusResult);  // 더하기 : 6.0

        double minuseResult = substractOperation.operate(3, 3);
        System.out.println("빼기 : " +minuseResult);  // 빼기 : 0.0

        double divisionResult = divideOperation.operate(3, 3);
        System.out.println("나누기 : " +divisionResult);  // 나누기 : 1.0

        double multiplicationResult = multiplyOperation.operate(3, 3);
        System.out.println("곱하기 : " +multiplicationResult);  // 곱하기 : 9.0

        double remainderResult = calculator.remainderOperation(3, 3);
        System.out.println("나머지 : " +remainderResult);  // 나머지 : 0.0
    }
}
