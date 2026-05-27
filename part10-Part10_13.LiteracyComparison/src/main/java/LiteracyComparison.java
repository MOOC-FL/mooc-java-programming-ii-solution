import java.util.stream.Stream;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

  public static void main(String[] args) {
    try {
      Files.lines(Paths.get("literacy.csv")).map(line -> {
        String[] parts = line.split(",");
        String name = parts[3].trim();
        int year = Integer.valueOf(parts[4].trim());
        String gender = parts[2].split(" ")[1];
        double rate = Double.valueOf(parts[5]);

        return new Country(name, year, gender, rate);

      }).sorted(Comparator.comparing(Country::getRate)).forEach(country -> System.out.println(country));
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
}
        return 0;

      })
          .forEach(country -> System.out.println(country));

    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
  }
}

