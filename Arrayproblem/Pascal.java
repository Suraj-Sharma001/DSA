package Arrayproblem;
import java.util.Scanner;
public class Pascal {

    public static void printMatrix(int [][] matrix) {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; i++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int n) {
        int [][] ans = new int [n][];
        for(int i=0; i<n; i++)
        {
            ans[i] = new int[i+1];
            // first and last element is 1
            ans[i][0] = ans[i][i] = 1;
            for(int j=0; j<i; j++)
            {
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int [][] ans = pascal(n);
        printMatrix(ans);
    }
}