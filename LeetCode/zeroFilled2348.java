package LeetCode;

import java.util.Scanner;

public class zeroFilled2348 {

    public static int zeroFilledSubArray(int[] arr) {
        int n = arr.length;
        int res = 0;
        int i = 0;

        while(i < n) {
            int l = 0;
            if(arr[i] == 0) {
                while (i < n && arr[i] == 0) {
                    i++;
                    l++;
                }
            } else {
                i++;
            }
            res += (l)*(l+1)/2;
        }
        return res;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr = new int[n];
        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = zeroFilledSubArray(arr);
        System.out.println(ans);
    }
}
