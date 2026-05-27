
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<books> booksList = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String word = scanner.nextLine();
            // int age = Integer.valueOf(scanner.nextLine());
            if (word.isEmpty()) {
                /*System.out.println(booksList.size() + " Books in total: ");
                System.out.println("Books: ");
                for (books book : booksList) {
                    System.out.println(book);
                }*/
               System.out.println(booksList.size() + " Books in total: ");
               Comparator<books> comparator = Comparator.comparing(books::getAge).thenComparing(books::getName);
                booksList.sort(comparator);
                for (books book : booksList) {
                    System.out.println(book);
                }
                break;

            } else {
                System.out.println("Input the age recommendation: ");
                int age = Integer.valueOf(scanner.nextLine());
                books book = new books(word, age);
                booksList.add(book);
            }

        }

    }

}
