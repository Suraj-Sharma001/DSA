package Arrayproblem;
import java.util.*;

public class Rotate {

    // function
    static void printarr(int [][] arr) {

    }
    static void transpose(int [][]arr, int r, int c) {
        for(int i=0; i<c; i++)
         {
            for(int j=i; j<r; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
             }
        }
    }
    static void revArray(int[] matrix) {
        int i=0, j=matrix.length-1;
        while(i<j)
        {
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j++;
        }
    }
    static void rotate(int[][]arr, int n) {
        // transpose 
        // the reverse each row
        transpose(arr, n, n);
        for(int i=0; i<n; i++)
        {
            revArray(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter the elements of array:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int [r][c];
        for(int i=0; i<r; i++)
        {
           for(int j=0; j<c; j++)
           {
               arr[r][c] = sc.nextInt();
           }
        }
        System.out.println();
        printarr(arr);
        rotate(arr,r );

        System.out.println("Rotated matrix : ");
        printarr(arr);
    }
}
