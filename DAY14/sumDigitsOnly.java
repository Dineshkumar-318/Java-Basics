import java.util.Scanner;

public class SumDigitsOnly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0';  
            }
        }
        System.out.println(sum);
    }
}