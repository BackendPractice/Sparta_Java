package Week_03.homework_2;

public class Calculator {
    double calculate(String operator, int firstNumber, int secondNumber) {
        switch (operator) {
//            case "더하기": return firstNumber+secondNumber;
//            case "빼기": return firstNumber-secondNumber;
//            case "나누기": return firstNumber/secondNumber;
//            case "곱하기": return firstNumber*secondNumber;
            case "나머지": return firstNumber%secondNumber;

            default:
                System.out.println("입력하신 연산을 수행할 수 없어요");
                return 0;
        }

    }
}
