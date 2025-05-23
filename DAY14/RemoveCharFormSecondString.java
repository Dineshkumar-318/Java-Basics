import java.util.Scanner;

public class RemoveCharsFromSecondString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string (characters to remove): ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string (source): ");
        String str2 = scanner.nextLine();

        // Convert str1 to a set of characters to remove
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (str1.indexOf(ch) == -1) {
                result.append(ch); // Keep character if not in str1
            }
        }

        // Output the result
        System.out.println("Output string: " + result.toString());

        scanner.close();
    
}
