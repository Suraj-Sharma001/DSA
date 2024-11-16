import java.util.*;

public class PrintArray {

    public static void printArray(int arr[], int idx) {
        // base case
        if(idx == arr.length) 
        {
            return;
        }
        // self work
        System.out.println(arr[0]);

        // recursive work
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
      int arr[] = {5, 4, 2, 3};
      printArray(arr, 0);
    }
}
