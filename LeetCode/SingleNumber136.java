package LeetCode;

import java.util.*;

public class SingleNumber136 {

    // 4, 1, 2, 1, 2
    static int singleNumber(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int num = singleNumber(arr);
        System.out.println(num);
    }
}
