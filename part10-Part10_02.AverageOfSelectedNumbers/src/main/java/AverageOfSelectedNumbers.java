
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String answer = scanner.nextLine();
            if (answer.equals("end")) {
                break;
            }
            inputs.add(answer);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String answer2 = scanner.nextLine();
        double any = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();

        double negative = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number < 0).average().getAsDouble();
        double positive = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(number -> number > 0).average().getAsDouble();
        if (answer2.equals("n")) {
            System.out.println("Average of the negative numbers: " + negative);
        } else if (answer2.equals("p")) {
            System.out.println("Average of the positive numbers: " + positive);

        } else {
            System.out.println("Average of the numbers: " + any);

        }
    }
}
