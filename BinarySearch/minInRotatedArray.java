package BinarySearch;

public class minInRotatedArray {

    public static int findMin(int[] arr) {
        int st = 0;
        int i = 0;
        int end = arr.length-1;
        while (st < end) {
            int mid = st+(end-st)/2;
            if(arr[mid] > arr[i]) {
                st = mid+1;
            } else {
                end = mid;
            }
        }
        return arr[st];
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {10, 11, 7, 8, 9};
        int ans = findMin(arr);
        System.out.print(ans);
    }
}
