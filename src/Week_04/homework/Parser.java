package Week_04.homework;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) {
        // 구현 1.
        return this;  // 에러를 없애기 위한 임시방편
    }

    public Parser parseSecondNum(String secondInput) {
        // 구현 1.
        return this;  // 에러를 없애기 위한 임시방편
    }

    public Parser parseOperator(String operationInput) {
        // 구현 1.
        return this;  // 에러를 없애기 위한 임시방편
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
