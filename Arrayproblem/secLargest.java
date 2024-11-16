package Arrayproblem;

import java.util.Scanner;

public class secLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of teh array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int sec_largest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sec_largest) {
                sec_largest = arr[i];
            }
        }
        System.out.println("Second largest element is " + sec_largest);
    }
}
