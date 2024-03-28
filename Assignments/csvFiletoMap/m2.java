package session;

import java.util.Map;

public class m2 {
    public static void main(String[] args) {
        String filePath = "D:/rw-output/country.csv"; // Change to the path of your CSV file
        Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
        char startsWith = 'M'; // Example: Filter countries starting with 'A'
        String outputFile = "D:\\output.txt"; // Change to desired output file path
        Country.writeFilteredCountries(outputFile, countryCapitalMap, startsWith);
        System.out.println("Filtered countries have been written to the file.");
    }
}
 