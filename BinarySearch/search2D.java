package BinarySearch;

import java.util.Scanner;

public class search2D {

    public static boolean searchIn2DArray(int[][] arr, int row, int col, int target) {
        int st = 0;
        int end = col-1;

        while (st <= end) {
            if(arr[st][end] > target) {
                end--;
            } else if(arr[st][end] < target) {
                st++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows in 2D array: ");
        int n = sc.nextInt();
        System.out.print("Enter the no of columns in 2D array: ");
        int m = sc.nextInt();
        System.out.println("Enter the elements 2D array: ");
        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the target to be searched: ");
        int target = sc.nextInt();
        boolean ans = searchIn2DArray(arr, n, m, target);
        if(ans){
            System.out.print("Element found successfully!");
        } else {
            System.out.print("ERROR 404, Element not found!");
        }
    }
}
