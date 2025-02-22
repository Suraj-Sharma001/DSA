package CP;

import java.util.Scanner;

public class HalloumiBoxes {

    public static boolean isSorted(int[] arr) {
        int i = 0;
        while(i < arr.length-1) {
            if(arr[i] <= arr[i+1]) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean solve(int[] arr, int n, int k) {
        if(isSorted(arr)) return true;
        if(n == k) return true;
        if(k == 1 && !isSorted(arr)) return false;
        return k > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean ans = solve(arr, n, k);

            if(ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
