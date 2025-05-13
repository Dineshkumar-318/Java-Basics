import java.util.Scanner;

public class EvenOddArrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the array
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] result = new int[num];

        // Read input numbers
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // First, add even numbers to result
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Then, add odd numbers to result
        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        // Print the final result
        for (int i = 0; i < num; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
