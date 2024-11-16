package Arrayproblem;

import java.util.*;
public class Arrey2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int column = sc.nextInt();

        // taking input
        int [][] arr = new int[row][column];
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}