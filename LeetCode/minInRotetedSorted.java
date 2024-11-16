import java.util.*;
class minInRotetedSorted {

    public static int minInRotetedSortedArray(int arr[], int n){
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
            // right part is sorted
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid+1;
            } else {
                // left past is sorted
                high = mid-1;
                ans = Math.min(ans, arr[mid]);
            }
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
        int ans = minInRotetedSortedArray(arr, n);
        System.out.println(ans);
    }
}
