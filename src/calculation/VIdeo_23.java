package calculation;

import java.util.LinkedList;
import java.util.Queue;

public class VIdeo_23 {
    public static void main(String[] args) {
        // Queue
        // 선언 + 생성
        Queue<Integer> intQueue = new LinkedList<>();

        // 추가
        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

        // 조회
        System.out.println(intQueue);  // [1, 2, 3]

        // 처음 추가된 값 조회
        System.out.println(intQueue.peek());  // 1

        // 길이
        System.out.println(intQueue.size());  // 3

        // 꺼내기
        while (!intQueue.isEmpty()) {
            System.out.print(intQueue + " ");  // [1, 2, 3] [2, 3] [3]
            intQueue.poll();
        }
    }
}
