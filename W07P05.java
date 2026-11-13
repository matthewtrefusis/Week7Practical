import java.nio.file.Path;
import java.util.Formatter;

public class W07P05 {
    public static void main(String[] args) {
        int[] ids = { 1, 2, 3, 4, 5, 6, 7 };
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace" };
        double[] balances = { 100.0, 200.0, 200.0, 150.0, 300.0, 150.0, 200.0 };

        Path path = Path.of("output.txt");
        try (Formatter formatter = new Formatter(path.toFile())) {
            for (int i = 0; i < ids.length; i++) {
                formatter.format("%s %.2f\n", names[i], balances[i]);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
    }
}
