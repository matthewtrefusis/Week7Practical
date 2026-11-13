import java.util.Scanner;

public class W07P14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String input;

    while(true){    
      input = scanner.nextLine();
      if (input.equals("END")) break;
      System.out.printf("%s, today, false\n", input);
    }

    scanner.close();
  }
}
