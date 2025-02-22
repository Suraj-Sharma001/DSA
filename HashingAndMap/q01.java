package HashingAndMap;

import java.util.HashMap;
import java.util.Scanner;

public class q01 {

    static void majorityElement(int[] arr) {
        // key value pair -> key unique
        HashMap<Integer, Integer> mp = new HashMap<>();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         majorityElement(arr);
    }
}
