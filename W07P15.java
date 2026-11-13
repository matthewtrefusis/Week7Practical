
import java.util.Scanner;

public class W07P15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] tasks = new String[n];

        for (int i = 0; i < n; i++) {
          tasks[i] = scanner.nextLine();
        }

        int k = Integer.parseInt(scanner.nextLine());
        String newDueDate = scanner.nextLine().trim();
        String newStatus = scanner.nextLine().trim();

        String[] parts = tasks[k].split(", ");
        String taskName = parts[0];

        tasks[k] = taskName + ", " + newDueDate + ", " + newStatus;

        for ( String task : tasks) {
          System.out.println(task);
        }

        scanner.close();
    }
}
