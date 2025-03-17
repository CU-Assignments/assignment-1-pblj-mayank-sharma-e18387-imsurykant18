import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] diff = new int[rows][cols];
        int[][] prod = new int[rows][cols];

        System.out.println("Enter Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat1[i][j] = sc.nextInt();

        System.out.println("Enter Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat2[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
                diff[i][j] = mat1[i][j] - mat2[i][j];
                for (int k = 0; k < cols; k++)
                    prod[i][j] += mat1[i][k] * mat2[k][j];
            }

        System.out.println("Addition:");
        printMatrix(sum);
        System.out.println("Subtraction:");
        printMatrix(diff);
        System.out.println("Multiplication:");
        printMatrix(prod);
        sc.close();
    }

    private static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}