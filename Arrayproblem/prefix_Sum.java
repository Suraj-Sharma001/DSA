package Arrayproblem;

import java.util.Scanner;

public class prefix_Sum {

    public static void prefixSum(int arr[], int n){
        int pref = 0;
        for(int i = 1; i < n; i++){
            arr[i] = pref+arr[i];
            pref = arr[i];
            //---------OR-----------//
//            arr[i] += arr[i-1];
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        prefixSum(arr, n);
    }
}
