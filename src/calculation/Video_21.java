package calculation;

import java.util.LinkedList;

public class Video_21 {
    public static void main(String[] args) {
        //LinkedList
        // 선언 + 생성
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // 추가
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);

        // 조회
        System.out.println(linkedList);  // [1, 2, 4]
        System.out.println("-----------");

        // 값을 중간에 추가
        linkedList.add(2, 3);

        System.out.println(linkedList);  // [1, 2, 3, 4]
        System.out.println("-----------");

        // 수정
        linkedList.set(0, 28);
        System.out.println(linkedList);  // [28, 2, 3, 4]
        System.out.println("-----------");

        // 삭제
        linkedList.remove(0);
        System.out.println(linkedList);  // [2, 3, 4]
        System.out.println("-----------");

        // 전체 삭제
        linkedList.clear();
        System.out.println(linkedList);  // []
    }
}
