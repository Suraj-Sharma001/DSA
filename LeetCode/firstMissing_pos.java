package LeetCode;

import java.util.Scanner;

public class firstMissing_pos {

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] temp = new boolean[n+1];

        for (int j : arr) {
            if (j > 0) {
                temp[j] = true;
            }
        }

        for(int i = 1; i <= n; i++){
            if(!temp[i]) {
                return i;
            }
        }
        return n+1;
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i : arr) {
            arr[i] = sc.nextInt();
        }

        int val = firstMissingPositive(arr);
        System.out.print(val);
    }
}
