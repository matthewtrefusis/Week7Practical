import java.io.IOException;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.Scanner;

public class W07P08 {
    public static void main(String[] args) {
        Path path = Path.of("numbers.txt");
        LinkedList<Integer> numbers = new LinkedList<>();

        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                numbers.addFirst(Integer.parseInt(scanner.nextLine()));
            }
        } catch (IOException e) {
            System.err.println(e);
        }

        System.out.print(numbers);
    }
}
