import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert to binary using built-in method
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary value: " + binary);
        scanner.close();
    }
}
