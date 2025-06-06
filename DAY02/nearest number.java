import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(), m = sc.nextInt();
    if (m == 0) System.out.println("Divisor cannot be zero.");
    else {
      int lower = (num / m) * m;
      int higher = (num % m == 0) ? lower : lower + m;
      int nearest = (Math.abs(num - lower) <= Math.abs(higher - num)) ? lower : higher;
      System.out.println("Nearest integer divisible by " + m + ": " + nearest);
    }
    sc.close();
  }
}