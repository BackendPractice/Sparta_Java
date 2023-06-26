package Week_03.homework_1;

public class Calculator {
    double calculate(String operator, int firstNumber, int secondNumber) {
        switch (operator) {
            case "더하기": return firstNumber+secondNumber;
            case "빼기": return firstNumber-secondNumber;
            case "나누기": return firstNumber/secondNumber;
            case "곱하기": return firstNumber*secondNumber;
            case "나머지": return firstNumber%secondNumber;

            default: return 0;
        }

    }
}
