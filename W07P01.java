
import java.nio.file.Files;
import java.nio.file.Path;

public class W07P01 {

    public static void main(String[] args) {
        Path path = Path.of("a.txt");
        try {
            Files.createFile(path);
        } catch (Exception e) {
            System.err.print(e);
        }
    }
}
