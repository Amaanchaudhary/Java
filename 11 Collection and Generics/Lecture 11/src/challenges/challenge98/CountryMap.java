package challenges.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("USA", "WASHINGTON D,C");
        countries.put("INDIA", "DELHI");
        countries.put("JAPAN", "TOKYO");
        countries.put("TURKEY", "ISTANBUL");
        countries.put("CHINA", "BEIJING");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Country Name you want to know the Capital of : ");
        String countryName = input.next().toUpperCase();
        if (countries.containsKey(countryName)) {
            System.out.printf("The Capital of %s, is %s", countryName, countries.get(countryName));
        } else {
            System.out.println("The Capital of " + countryName + " is not in the list");
        }
    }
}
