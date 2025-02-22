package LeetCode;

import java.util.Scanner;

public class removeDuplicates26 {

    // Remove dup from a Sorted array and return the total no of unique elem from array in O(1) time.
    static int removeDuplicates(int []arr) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(j < n) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = removeDuplicates(arr);
            System.out.print(ans);
    }
}
