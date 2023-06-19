package Week_02;

import java.util.Arrays;

public class Video_13 {
    public static void main(String[] args) {
        int[] intArray = new int[3]; // 초기값 {0,0,0}
        boolean[] boolArray = new boolean[3]; // 초기값 {false, false, false}
        String[] stringArray = new String[3]; // 초기값 {"","",""}

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(boolArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println("----------------");

        // 단건 조회
        System.out.println(intArray[1]);
        System.out.println("----------------");

        // 다건 조회
        for (int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }

        System.out.println("----------------");

        // 초기화
        // (1) {}
        int[] intArr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(intArr));
        System.out.println("----------------");

        // (2) for문
        for (int i=0; i<intArr.length; i++) {
            intArr[i] = i;
        }

        System.out.println(Arrays.toString(intArr));
        System.out.println("----------------");

        // (3) Arrays.fill : 배열의 요소를 같은 값으로 초기화
        Arrays.fill(intArr, 1);
        System.out.println(Arrays.toString(intArr));
    }
}
