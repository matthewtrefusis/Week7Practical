import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class W07P16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            String input = scanner.nextLine();
            String[] inputs = input.split(" ");

            String lockfileName = inputs[0];
            int waitSeconds = Integer.parseInt(inputs[1]);

            Path lockFile = Path.of(lockfileName);

            try {
                FileWriter writer = new FileWriter(lockFile.toFile());
                writer.write("locked");
                writer.close();

                System.out.println("File created and written. Waiting " + waitSeconds + " seconds.");

                Thread.sleep(waitSeconds * 1000);

                Files.deleteIfExists(lockFile);
                System.out.println("File deleted successfully.");
            } catch (IOException | InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
