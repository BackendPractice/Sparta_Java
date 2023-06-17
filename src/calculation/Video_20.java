package calculation;

import java.util.ArrayList;

public class Video_20 {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> intList = new ArrayList<Integer>();  // 선언 + 생성

        // 추가
        intList.add(1);
        intList.add(2);
        intList.add(3);

        // 조회
        System.out.println(intList.toString());  // [1, 2, 3]
        System.out.println("-----------");

        // 수정
        intList.set(0, 28);
        System.out.println(intList.toString());  // [28, 2. 3]
        System.out.println("-----------");

        // 삭제
        intList.remove(0);
        System.out.println(intList.toString());  // [2, 3]
        System.out.println("-----------");

        // 전체 삭제
        System.out.println(intList.toString());  // []
        intList.clear();
    }
}
