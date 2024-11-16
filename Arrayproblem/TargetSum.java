package Arrayproblem;

// Q- Find the number of pairs in array whose sum is equals to given num x.
// Ex = [4 6 3 5 8 2] and target = 7 hence ans will be 2(4+3 and 5+2).


import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of an array: ");
    for(int i=0; i<n; i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("Enter the target sum: ");
    int target = sc.nextInt();
    int ans = 0;
    for(int i=0; i<n; i++)
    {
        for(int j=i+1; j<n; j++)
        {
            if(arr[i]+arr[j] == target )
            {
                ans++;
            }
        }
    }
   
        System.out.println(ans);
}
}
