
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class W07P03 {

    public static void main(String[] args) {
        Path dir = Path.of("sourceDirectory");

        try (Stream<Path> stream = Files.list(dir)) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.err.print(e);
        }
    }
}
