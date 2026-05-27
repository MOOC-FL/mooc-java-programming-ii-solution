
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {
        //ArrayList<Country> countries = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .skip(1) // Skip the header line
                    .map(line -> line.split(","))
                    .filter(parts -> parts.length == 3) // Ensure there are exactly 3 parts
                    .forEach(parts -> {
                        String string = "Adult literacy rate, population 15+ years, female (%),Zimbabwe,2015,85.28513";
                        String[] pieces = string.split(",");
                        // now pieces[0] equals "Adult literacy rate"
                        // pieces[1] equals " population 15+ years"
                        // etc.

                        // to remove whitespace, use the trim() method:
                        pieces[1] = pieces[1].trim();
                    });
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
