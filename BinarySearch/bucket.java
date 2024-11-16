package BinarySearch;

public class bucket {

    public static int MBucket(int arr[], int m, int k){
        long val = (long) m * k;
        int n = arr.length;
        if (val > n) return -1;
        // Find maximum and minimum:
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            low = Math.min(low, arr[i]);
            high = Math.max(high, arr[i]);
        }

        while(low <= high){
            int mid = (low + high)/2;
            if(isPossible(arr, m, k, mid) == true){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }

    public static boolean isPossible(int arr[], int m, int k, int day){
        int n  = arr.length;
        int count = 0;
        int NOB = 0;
        for(int i=0; i<n; i++){
            if(arr[i] <= day){
                count++;
            } else {
                NOB += (count/k);
                count = 0;
            }
        }
        NOB += (count/k);
        if(NOB >= m){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = MBucket(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);
    }
}
