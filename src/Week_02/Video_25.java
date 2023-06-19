package Week_02;

import java.util.HashMap;
import java.util.Map;

public class Video_25 {
    public static void main(String[] args) {
        // Map
        // 선언 + 생성
        Map<String, Integer> intMap = new HashMap<>();

        // 추가
        intMap.put("기동", 28);
        intMap.put("민지", 27);
        intMap.put("모름", 39);
        intMap.put("모름", 40);
        intMap.put("모름", 55);

        // 출력 - 중복된 key 제거
        System.out.println(intMap);  // {민지=27, 모름=55, 기동=28}

        // 전체 key 조회
        System.out.println(intMap.keySet());  // [민지, 모름, 기동]

        // 전체 value 조회
        System.out.println(intMap.values());  // [27, 55, 28]

        // 조회
        System.out.println(intMap.get("기동"));  // 28

        // 삭제
        intMap.remove("모름");
        System.out.println(intMap);  // {민지=27, 기동=28}
    }
}
