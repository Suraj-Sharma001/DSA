package Arrayproblem;

import java.util.Scanner;

public class SecondLast {
    // first we find the max in array
    static int findmax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    // set max to be min or -infnite
    static int findSecMax(int [] arr) {
        int max = findmax(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        // new again triverse for sec max
        int findSecMax = findmax(arr);
        return findSecMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSecMax(arr));

    }
}
