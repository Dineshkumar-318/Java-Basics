import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a positive integer: ");
    int n = sc.nextInt();

    if (n > 0) {
      int steps = 0;
      System.out.print("Collatz Sequence:\n");

      while (n != 1) {
        System.out.print(n + " -> ");
        if (n % 2 == 0) {
          n = n / 2;
        } else {
          n = 3 * n + 1;
        }
        steps++;
      }

      System.out.println("1");
      System.out.println("Total steps: " + steps);
    } else {
      System.out.println("Please enter a positive integer.");
    }

    sc.close();
  }
}