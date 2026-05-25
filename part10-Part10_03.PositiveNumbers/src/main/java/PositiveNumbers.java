
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = Arrays.asList(5, -2, 10, -7, 3, 0);
        List<Integer> positives = PositiveNumbers.positive(numbers);
        System.out.println(positives); // Output: [5, 10, 3]

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(value -> value > 0).collect(Collectors.toList());
    }
}
