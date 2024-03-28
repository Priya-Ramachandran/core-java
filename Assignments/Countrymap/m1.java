package session;

import java.util.Map;

public class m1 {
	   public static void main(String[] args) {
	       String filePath = "D:/rw-output/country.csv"; // Change to the path of your CSV file
	       Map<String, String> countryCapitalMap = Countrymap.loadCsvFileToMap(filePath);
	       for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	           System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
	       }
	   }
	}