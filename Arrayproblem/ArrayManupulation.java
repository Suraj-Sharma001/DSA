package Arrayproblem;

import java.util.*;
public class ArrayManupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}