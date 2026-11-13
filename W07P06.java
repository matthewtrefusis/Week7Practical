import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class W07P06 {
    public static void main(String[] args) {
        try {
            String uriString = new File("input.txt").toURI().toString();
            Path path = Paths.get(new URI(uriString));

            try (Scanner scanner = new Scanner(path)) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
        } catch (URISyntaxException e) {
            System.err.println("Invalid URI: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Could not read file: " + e.getMessage());
        }
    }
}
