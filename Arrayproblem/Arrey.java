package Arrayproblem;

import java.util.*;
public class Arrey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];  // decleration of array
        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be search:");
        int key = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(arr[i] == key)
            {
                System.out.println("Element found at index" + i);
            }
        }
    }
}