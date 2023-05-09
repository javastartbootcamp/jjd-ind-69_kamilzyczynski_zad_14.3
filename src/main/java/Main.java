import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    // nie zmieniaj nic w main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.run(scanner);
    }

    void run(Scanner scanner) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("countries.csv"));
            Map<String, Country> countryMap = new HashMap<>();
            String nextLine = null;
            while ((nextLine = reader.readLine()) != null) {
                String[] split = nextLine.split(";");
                long population = Long.parseLong(split[2]);
                countryMap.put(split[0], new Country(split[0], split[1], population));
            }
            reader.close();

            System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje:");
            scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            scanner.close();
            Country country = countryMap.get(userInput);

            if (country != null) {
                System.out.println(country);
            } else {
                System.out.println("Kod kraju " + userInput + " nie został znaleziony.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku countries.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

