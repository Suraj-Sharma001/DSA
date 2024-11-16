package Arrayproblem;

import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int column = sc.nextInt();
        System.out.println("Enter the elements of array: ");    
        int [][] arr = new int[row][column];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<column; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be search: ");
         int key = sc.nextInt();
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                if(arr[i][j] == key) {
                    System.out.println("Element found at index: " + i + " " + j);
                }
            }
        }
    }
}
