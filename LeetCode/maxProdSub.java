import java.util.*;

public class maxProdSub {

    public static int maxProductSubArray(int[] arr, int n){
        int ans = Integer.MIN_VALUE;
        int pref  = 1;
        int suff = 1;
        for(int i = 0; i < n; i++){
            if(pref == 0) pref = 1;
            if(suff == 0) suff = 1;
            pref = pref*arr[i];
            suff = suff*arr[n-i-1];
            ans = Math.max(ans, Math.max(pref, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxProductSubArray(arr,n);
        System.out.println(ans);
    }
}
