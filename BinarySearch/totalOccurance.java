package BinarySearch;

import java.util.Scanner;

public class totalOccurance {

    public static int findFirstOcc(int[] arr, int l, int h, int key) {
        int first_occ = -1;
        while(l <= h) {
            int mid = l+(h-l)/2;
            if(arr[mid] == key) {
                first_occ = mid;
                h = mid-1;
            } else if(arr[mid] > key) {
                h = mid-1;
            } else {
                l = mid+1;
            }
        }
        System.out.println("First occ of key : " + first_occ);
        return first_occ;
    }

    public static int findLastOcc(int[] arr, int l, int h, int key) {
        int last_occ = -1;
        while(l <= h) {
            int mid = l+(h-l)/2;
            if(arr[mid] == key) {
                last_occ = mid;
                l = mid+1;
            } else if(arr[mid] > key) {
                h = mid-1;
            } else {
                l = mid+1;
            }
        }
        System.out.println("Last occ of key : " + last_occ);
        return last_occ;
    }

    public static int findTotalOccurance(int[] arr, int target) {
        int l = 0;
        int h = arr.length-1;
        int first_occ = findFirstOcc(arr, l, h, target);
        int sec_occ = findLastOcc(arr, l, h, target);
        return sec_occ - first_occ +1;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 3, 3, 3, 5};
        int target = sc.nextInt();
        int count = findTotalOccurance(arr, target);
        System.out.println("Total count of key is: " + count);
    }
}
