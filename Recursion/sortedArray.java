package Recursion;

import java.util.Scanner;

public class sortedArray {

    static boolean isSorted(int[] arr, int idx) {
        if(idx == arr.length){
            return false;
        }
        if(arr[0] > arr[1]){
            return false;
        } else {
            return isSorted(arr, idx+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }
}
