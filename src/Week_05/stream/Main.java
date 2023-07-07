package Week_05.stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> carNames = Arrays.asList("Series 6", "A9", "Ionic 6");

        System.out.println(carNames.stream()
                .map(name -> name.toUpperCase()).toList());

        // [SERIES 6, A9, IONIC 6]
    }
}
