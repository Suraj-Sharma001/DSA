package TwoDArray;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows1 = sc.nextInt();
        int col1 = sc.nextInt();

        // Decleration of 2-D array
        int[][] matrix1 = new int[rows1][col1];

        // Input of 2-D array
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < col1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        int rows2 = sc.nextInt();
        int col2 = sc.nextInt();

        // Decleration of 2-D array
        int[][] matrix2 = new int[rows2][col2];

        // Input of 2-D array
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if (col1 != rows2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int mul[][] = new int[rows2][col1];
        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                for (int k = 0; k < col1; k++) {
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }   

        for (int i = 0; i < mul.length; i++) {
            for (int j = 0; j < mul[0].length; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }

    }
}
