package Recursion;

import java.util.Scanner;

public class firstIdxOcc {

    static int firstOccuranceofIdx(int []arr, int idx, int elm) {

        if(idx == arr.length) {
            return -1;
        }
            if(arr[idx] == elm){
                return idx;
            } else {
                return firstOccuranceofIdx(arr, idx+1, elm);
            }
    }

    static int lastOccuranceofIdx(int []arr, int idx, int elm) {
        if(idx == arr.length) {
            return -1;
        }

        int occ = lastOccuranceofIdx(arr, idx+1, elm);

        if(arr[idx] == elm) {
            return elm;
        } else {
            return occ;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of an array: ");
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the elm for first and last idx occ: ");
        int elm = sc.nextInt();

        int ans = firstOccuranceofIdx(arr, 0, elm);
        int ans2 = lastOccuranceofIdx(arr, 0, elm);
        System.out.println("Fist occ is: " + ans);
        System.out.println("Last occ is: " + ans2);
    }
}
