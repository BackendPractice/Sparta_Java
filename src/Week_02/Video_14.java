package Week_02;

import java.util.Arrays;

public class Video_14 {
    public static void main(String[] args) {
        // 얕은 복사
        int[] intArr_1 = {1,2,3};
        int[] intArr_2 = intArr_1;
        System.out.println(Arrays.toString(intArr_1));  // [1, 2, 3]
        System.out.println("-----------");

        // intArr_2의 요소를 바꿨으나 intArr_1의 요소도 바뀌었다.
        // 얕은 복사로 같은 주소값을 바라보고 있기 때문이다.
        intArr_2[0] = 28;
        System.out.println(Arrays.toString(intArr_1));  // [28, 2, 3]
        System.out.println("-----------");

        // 깊은 복사
        // (1) for문
        int[] forArr = new int[intArr_1.length];

        for (int index=0; index < intArr_1.length; index++) {
            forArr[index] = intArr_1[index];
        }

        forArr[0] = 38;
        System.out.println(Arrays.toString(intArr_1));  // [28, 2, 3]
        System.out.println("-----------");

        // (2) clone
        // 2차원 이상 배열에서는 얕은 복사로 동작한다.
        int[] cloneArr = intArr_1.clone();

        cloneArr[0] = 38;
        System.out.println(Arrays.toString(intArr_1));  // [28, 2, 3]
        System.out.println("-----------");

        // (3) Arrays.copyOf(Array, Array.length)
        int[] copyOfArr = Arrays.copyOf(intArr_1, intArr_1.length);

        copyOfArr[0] = 38;
        System.out.println(Arrays.toString(intArr_1));  // [28, 2, 3]
    }
}
