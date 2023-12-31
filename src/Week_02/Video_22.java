package Week_02;

import java.util.Stack;

public class Video_22 {
    public static void main(String[] args) {
        // Stack
        // 선언 + 생성
        Stack<Integer> intStack = new Stack<Integer>();

        // 추가
        intStack.push(0);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        // 조회
        System.out.println(intStack);  // [0, 1, 2, 3]

        // 최근 추가된 값 조회
        System.out.println(intStack.peek());  // 3

        // 길이
        System.out.println(intStack.size());  // 4

        // 꺼내기
        while (!intStack.isEmpty()) {
            System.out.print(intStack + " ");  // [0, 1, 2, 3] [0, 1, 2] [0, 1] [0]
            intStack.pop();
        }
    }
}
