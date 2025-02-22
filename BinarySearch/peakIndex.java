package BinarySearch;

public class peakIndex {

    public static int findPeakIndex(int[] arr) throws Exception{
        int l = 0;
        int h = arr.length-1;
        while (l <= h) {
            int mid = l+(h-l)/2;
            if((arr[mid] > arr[mid-1]) && (arr[mid] < arr[mid+1])){
                l = mid+1;
            } else if((arr[mid] < arr[mid-1]) && (arr[mid] > arr[mid+1])){
                h = mid-1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception{
        int[] arr = {0, 2, 5, 10, 20, 50, 3, 0};
        int peak_idx = findPeakIndex(arr);
        System.out.println(peak_idx);
    }
}
