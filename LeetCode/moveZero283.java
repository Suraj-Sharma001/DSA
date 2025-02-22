package LeetCode;

import java.util.Scanner;

public class moveZero283 {

    // Input = [0, 1, 0, 3, 12]
    // Output = [1, 3, 12, 0, 0]

    static void MoveZeros(int []arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(i < j) {
            if(arr[j] == 0) {
                j--;
            } else if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        MoveZeros(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
