
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class W07P04 {

    public static void main(String[] args) {
        Path inputPath = Path.of("input.txt");
        Path outputPath = Path.of("output.txt");

        try (Scanner scanner = new Scanner(inputPath); FileWriter writer = new FileWriter(outputPath.toFile())) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
