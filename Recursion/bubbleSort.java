package Recursion;

public class bubbleSort {

    public static void sortArray(int[] arr, int n) {
        // base case -> single element in array
        if(n == 0 || n == 1) {
            return;
        }

        // 1 case check baaki recursion dekh lega!!
        for(int i = 0; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sortArray(arr, n-1);
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {2, 5, 1, 6, 9};
        int n = arr.length;

        sortArray(arr, n);  // TC -> O(n) and SC -> O(n)

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
