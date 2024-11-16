public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = {3, -4, 5, 4, -1, 7, -8};
        int macSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int currSum = 0;
            for(int j = i; j < arr.length; j++){
                currSum += arr[j];
                macSum = Math.max(macSum, currSum);
            }
        }
        System.out.println(macSum);  // [5, 4, -1, 7] == 15
    }
}
