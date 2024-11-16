package TwoDArray;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();

        // Decleration of 2-D array
        int[][] matrix = new int[rows][col];

        // Input of 2-D array
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print 2-D array
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
