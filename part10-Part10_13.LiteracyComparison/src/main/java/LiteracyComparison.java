import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<LiteracyData> dataList = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("literacy.csv"))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] pieces = line.split(",");
                
                // Trim whitespace from each piece
                for (int i = 0; i < pieces.length; i++) {
                    pieces[i] = pieces[i].trim();
                }
                
                // Extract gender information from the theme field
                String theme = pieces[0];
                String genderInfo = pieces[2];
                String country = pieces[3];
                int year = Integer.parseInt(pieces[4]);
                double literacyPercent = Double.parseDouble(pieces[5]);
                
                // Extract just the gender from the gender field
                String gender = genderInfo.contains("female") ? "female" : "male";
                
                dataList.add(new LiteracyData(country, year, gender, literacyPercent));
            }
            
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }
        
        // Sort by literacy percentage
        Collections.sort(dataList);
        
        // Print the results
        for (LiteracyData data : dataList) {
            System.out.println(data);
        }
    }
    
}
