package Week_02;

public class VIdeo_11 {
    public static void main(String[] args) {
        // while
        int num = 0;
        while (num < 3) {
            num ++;
            System.out.println(num);
        }

        System.out.println("---------------");

        // do ~ while
        int num_2 = 0;
        do {
            System.out.println(num_2);
        } while (num_2 > 3);

        System.out.println("---------------");

        // continue
        int num_3 = 0;
        while (num_3 < 3) {
            num_3++;
            if (num_3 == 2) {
                continue;
            }
            System.out.println(num_3);
        }
        }
}
