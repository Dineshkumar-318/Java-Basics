import java.util.Scanner;

public class MaxInEachColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        for (int j = 0; j < cols; j++) {
            int max = a[0][j];
            for (int i = 1; i < rows; i++) {
                if (a[i][j] > max)
                    max = a[i][j];
            }
            System.out.println("Max in column " + (j + 1) + ": " + max);
        }

        sc.close();
    }
}
