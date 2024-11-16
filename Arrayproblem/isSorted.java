package Arrayproblem;

import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int flag = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                flag = 1;
            } else {
                flag = -1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
