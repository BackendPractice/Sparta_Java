package calculation;

public class Video_19 {
    public static void main(String[] args) {
        // 최대값
        int[] arr = {23, 64, 62, 13};

        int maxNum = arr[0];

        for (int item : arr) {
            if (item > maxNum) {
                maxNum = item;
            }
        }
        System.out.println("최대값 : " + maxNum);  // 64

        // 최소값
        int minNum = arr[0];

        for (int item : arr) {
            if (item < minNum) {
                minNum = item;
            }
        }
        System.out.println("최소값 : " +minNum);  // 13
    }
}
