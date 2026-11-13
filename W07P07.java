import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class W07P07 {
    public static void main(String[] args) {
        Path path = Path.of("fruits.txt");

        try {
            ArrayList fruits = new ArrayList<>(Files.readAllLines(path));
            System.out.print(fruits);
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
