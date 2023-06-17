package calculation;

import java.util.HashSet;
import java.util.Set;

public class Video_24 {
    public static void main(String[] args) {
        // Set
        // 선언 + 생성
        Set<Integer> intSet = new HashSet<>();

        // 추가
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(1);
        intSet.add(2);

        // 조회 - 중복된 값 제거
        System.out.println(intSet);  // [1, 2, 3]

        // 포함확인
        System.out.println(intSet.contains(2));  // true
        System.out.println(intSet.contains(5));  // false
    }
}
