package BinarySearch;

import java.util.Scanner;

public class firstAndLastPos {

    public static int findPosition(int[] arr, int target) {
        int l = 0;
        int h = arr.length-1;
        int ans = -1;
        while(l <= h) {
            int mid = l+(h-l)/2;
            if(arr[mid] == target) {
                ans = mid;
                // first occ
                h = mid-1;
                // last occ ->
//                l = mid+1;
            } else if(arr[mid] > target) {
                h = mid-1;
            } else {
                l = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = {0 , 0, 1, 1, 2, 2, 2, 2};
        int target = sc.nextInt();
        int pos = findPosition(arr, target);
        System.out.print(pos);
    }
}
