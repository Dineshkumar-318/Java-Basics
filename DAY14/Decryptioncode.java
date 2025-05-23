import java.util.Scanner;

public class Decryptcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        String s = Integer.toString(n);
        int[] perm = {1, 3, 3, 2, 4};

        StringBuilder decrypted = new StringBuilder();
        for (int index : perm) {
            decrypted.append(s.charAt(index));
        }

        System.out.println(Integer.parseInt(decrypted.toString()));
    }
}