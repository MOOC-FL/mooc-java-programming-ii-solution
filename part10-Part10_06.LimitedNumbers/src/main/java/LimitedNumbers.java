import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter a number (type 'any negative number' to quit):");

        while(true){
            int input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            numbers.add(input);
        }
        System.out.println("You entered:");
        numbers.stream().filter(number -> number <= 5).forEach(System.out::println);
        
    }
}

 