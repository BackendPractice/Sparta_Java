package Week_02;

public class Video_17 {
    public static void main(String[] args) {
        // 가변 배열 (1)
        int[][] array_1 = new int[2][];

        // 배열 원소마다 각기 다른 크기로 지정
        array_1[0] = new int[2];
        array_1[1] = new int[4];

        // 가변 배열 (2)
        int[][] array_2 = {
                {10,20},
                {10,20,30,40}
        };
    }
}
