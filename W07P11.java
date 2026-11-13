import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class W07P11 {
    public static void main(String[] args) {
        Path dirPath = Paths.get("practiceDir");
        Path filePath = dirPath.resolve("hello.txt");

        try {
            Files.createDirectories(dirPath);

            System.out.println(filePath + " exist before creation:" + Files.exists(filePath));

            Files.createFile(filePath);

            System.out.println(filePath + " exist after creation:" + Files.exists(filePath));

            Files.delete(filePath);

            System.out.println(filePath + " exist after deletion:" + Files.exists(filePath));

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
