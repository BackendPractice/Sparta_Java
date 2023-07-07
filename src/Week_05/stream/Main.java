package Week_05.stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> carNames = Arrays.asList("Series 6", "A9", "Ionic 6");

        carNames.stream()
                .forEach(System.out::println);

        // Series 6
        // A9
        // Ionic 6
    }
}
