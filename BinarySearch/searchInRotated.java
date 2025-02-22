package BinarySearch;

import java.util.Scanner;

public class searchInRotated {

    public static int findPiv(int[] arr) {
        int st = 0;
        int end = arr.length-1;

        while(st < end) {
            int mid = st+(end-st)/2;
            if(arr[mid] > arr[end]) {
                st = mid+1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    public static int bs(int[] arr, int target, int st, int end) {
        while (st <= end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return -1;
    }

    public static int search(int[] arr, int target) {
        int n = arr.length;
        int piv = findPiv(arr);
        int idx = bs(arr, target, 0, piv-1);
        if(idx != -1) {
            return idx;
        }
        idx = bs(arr, target, piv, n-1);

        return idx;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 11, 7, 8, 9};
        int target = sc.nextInt();
        int ans = search(arr, target);
        System.out.print(ans);
    }
}
