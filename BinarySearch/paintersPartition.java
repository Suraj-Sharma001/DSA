package BinarySearch;

import java.util.Scanner;

public class paintersPartition {

    public static int painters_Partition(int[] arr, int n, int p) {
        int ans = -1;
        
        return ans;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array: ");
        int[] arr = new int[n];
        System.out.print("Enter the no of painters: ");
        int p = sc.nextInt();
        int ans  = painters_Partition(arr, n, p);
        System.out.print(ans);
    }
}
