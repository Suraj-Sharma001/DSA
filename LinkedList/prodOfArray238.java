package LinkedList;

import java.util.Scanner;

public class prodOfArray238 {

    // Follow up = O(n) time and no use of divide operator.

    static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        /* BruteForce 01 -> TC = O(n^2)


        for(int i = 0; i < n; i++){
            ans[i] = 1;
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                ans[i] = ans[i] * arr[j];
            }
        }
        */

        /* BruteForce 02 -> TC = O(n) but wrong ans in case of 0 in the array
         int mul = 1;
        for(int i =0 ; i < n; i++){
            mul = mul * arr[i];
        }

        for(int i = 0; i < n; i++){
            ans[i] = mul / arr[i];
        } */

        /* Better 03 -> TC = O(n) and SC = O(2n)

        int[] left = new int[n];
        int[]right = new int[n];

        left[0] = 1;
        right[n-1] = 1;

        for (int i = 1; i < n; i++) {
            left[i] = arr[i-1] * left[i-1];
        }

        for (int i = n-2; i >= 0; i--) {
            right[i] = arr[i+1] * right[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
         */

        // Optimal 04 -> TC(n) and SC(1)
        ans[0] = 1;
        ans[n-1] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = ans[i-1] * arr[i-1];
        }
        int rightP = 1;
        for(int i = n-1; i >= 0; i--){
            ans[i] = ans[i] * rightP;
            rightP *= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.print("Enter the elements of array: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int []ans;
        ans = productExceptSelf(arr);

        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
