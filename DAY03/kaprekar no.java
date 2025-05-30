import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int sq = n * n;
    boolean kaprekar = false;

    for (int i = 1; i < sq; i *= 10) {
      int left = sq / i;
      int right = sq % i;
      if (right > 0 && left + right == n) {
        kaprekar = true;
        break;
      }
    }

    if (n == 1 || kaprekar)
      System.out.println("Kaprekar Number");
    else
      System.out.println("Not a Kaprekar Number");
  }
}