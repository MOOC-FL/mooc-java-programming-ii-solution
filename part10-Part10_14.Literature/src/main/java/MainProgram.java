
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<books> booksList = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String word = scanner.nextLine();
            //int age = Integer.valueOf(scanner.nextLine());
            if (word.isEmpty()) {
                break;
            } else {
                System.out.println("Input the age recommendation: ");
                //age = Integer.valueOf(scanner.nextLine());
                books book = new books(word, age);
                booksList.add(book);
            }
        }
    }
}