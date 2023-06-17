package calculation;

import java.util.Arrays;

public class Video_16 {
    // 2차원 배열
    public static void main(String[] args) {
        int[][] array_1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(array_1);  // [[I@4563e9ab
        System.out.println(Arrays.toString(array_1));  // [[I@4563e9ab, [I@11531931]

        int[][] array_2 = new int[2][3]; // 최초 선언

        for (int i = 0; i < array_2.length; i++) {
            for (int j = 0; j < array_2[i].length; j++) {
                array_2[i][j] = 1;
            }
        }

        System.out.println(array_2);  // [[I@1fbc7afb
        System.out.println(Arrays.toString(array_2));  // [[I@5e025e70, [I@1fbc7afb]
    }
}
