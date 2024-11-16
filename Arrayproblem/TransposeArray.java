package Arrayproblem;
import java.util.*;

public class TransposeArray {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter the no. of row and column: "); 
         int r = sc.nextInt();
         int c = sc.nextInt();
         System.out.println("Total element" + r*c);
         System.out.println("Enter the elements of array:");
         int [][] arr = new int [r][c];
         for(int i=0; i<r; i++)
         {
            for(int j=0; j<c; j++)
            {
                arr[r][c] = sc.nextInt();
            }
         }

         System.out.println("Transpose matrix is: ");
         for(int i=0; i<c; i++)
         {
            for(int j=i; j<r; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }
  }
}
