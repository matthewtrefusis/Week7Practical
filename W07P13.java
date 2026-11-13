import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;

public class W07P13 {
    public static void main(String[] args) {
        Path path = Path.of("tasks.txt");
        Path outputPath = Path.of("tasks_updated.txt");

        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(outputPath.toFile())) {
            List<String> lines = Files.readAllLines(path);

            System.out.println("Save a new task");
            String newTask = scanner.nextLine();
            lines.add(newTask);

            for (String line : lines) {
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
