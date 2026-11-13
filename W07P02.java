
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class W07P02 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter file path inside sourceDirectory:");

                String filePath = scanner.nextLine();

                Path path = Path.of("sourceDirectory", filePath);

                boolean fileExists = Files.exists(path);

                System.out.printf("File exists: %b\n", fileExists);
                System.out.println();
            }
        }
    }
}
