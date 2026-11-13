import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;

public class W07P10 {
    public static void main(String[] args) {
        Path fruitsPath = Path.of("fruits.txt");

        try {
            var fruits = new HashSet<>(Files.readAllLines(fruitsPath));
            System.out.print(fruits);
        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.println();

        Path numbersPath = Path.of("numbers.txt");
        var numbers = new HashSet<>();

        try (Scanner scanner = new Scanner(numbersPath)) {
            while (scanner.hasNextLine()) {
                numbers.add(Integer.parseInt(scanner.nextLine()));
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.print(numbers);

    }
}
