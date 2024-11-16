package Arrayproblem;
import java.util.*;

public class SpiralMatrix {

    public static void printMatrix(int [][] matrix) {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix.length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiral(int [][] matrix, int r, int c) {
        int topRow = 0;
        int button_row = r-1;
        int left_col = 0;
        int right_col = c-1;
        int totalElements = 0;
        while(totalElements < r*c) {
            // print top row -> left col to right col
            for(int j=left_col; j<=right_col; j++)
            {
                System.out.println(matrix[topRow][j] + " ");
            }
            topRow++;
            // print right col -> top row to buttom row
            for(int i=topRow; i<=button_row; i++)
            {
                System.out.println(matrix[i][right_col] + " ");
            }
            right_col--;
            // print buttom row -> right col to left col
            for(int j=right_col; j>=left_col; j--)
            {
                System.out.println(matrix[button_row][j]);
            }
            button_row--;
            // print left col -> buttom row to top row
            for(int i=button_row; i>=topRow; i--)
            {
                System.out.println(matrix[i][left_col]);
            }
            left_col++;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[r][c];
        System.out.println("Enter the elements: ");
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix.length; j++) 
            {
                 matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Answer matrix: ");
        printMatrix(matrix);
        
        System.out.println("Spiral order: ");
        printSpiral(matrix, r, c);
    }
}
