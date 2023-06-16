package calculation;

public class Video_10 {
    public static void main(String[] args) {
        // for문
        for (int index = 0; index < 5; index++) {
            System.out.println(index);
        }

        // 향상된 for문
        int[] numbers = {3, 6, 9, 12, 15};
        for (int number : numbers) {
            System.out.println(number);
        }

        // for문
//        int[] numbers = {3, 6, 9, 12, 15};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }
}
