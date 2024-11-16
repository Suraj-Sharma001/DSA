import java.util.Arrays;

class LongetConsSeq {

    public static int longestConsecutive(int arr[], int n){
        Arrays.sort(arr);
        int count = 0;
        int largest = 1;
        int lastSmallest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] - 1 == lastSmallest){
                count++;
                lastSmallest = arr[i];
            } else if(arr[i] != lastSmallest){
                count = 1;
                lastSmallest = arr[i];
            }
            largest = Math.max(largest, count);
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {102, 4, 100, 5, 1, 101, 3, 2, 1, 103, 104, 105, 105, 105, 106};
        int n = arr.length;
        int ans = longestConsecutive(arr,n);
        System.out.println(ans);
    }
}
