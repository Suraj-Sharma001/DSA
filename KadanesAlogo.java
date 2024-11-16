public class KadanesAlogo {
    public static void main(String[] args) {
        int arr[] = {3, -4, 5, 4, -1, 7, -8};
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int currSum = 0;
            currSum += arr[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
