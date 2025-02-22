package BinarySearch;

public class singleElem {

    public static int singeElementInSortedArray(int[] arr) {
        int n = arr.length;

        /* O(n)
        int ans = arr[0];
        for(int i = 1; i < n; i++) {
            ans = ans ^ arr[i];
        }
         */

        // O(logn) -> binary search

        int l = 0;
        int h = n-1;

        while (l < h) {
            int mid = l+(h-l)/2;

            boolean isEven = (h - mid) % 2 == 0;

            if(arr[mid] == arr[mid+1]) {
                if(isEven) {
                    l = mid+2;
                } else {
                    h = mid-1;
                }
            } else {
                if(isEven) {
                    h = mid;
                } else {
                    l = mid+1;
                }
            }
        }
        return arr[h];
    }

    public static void main(String[] args) throws Exception{
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8 ,8 };
        int ans = singeElementInSortedArray(arr);
        System.out.print(ans);
    }
}
