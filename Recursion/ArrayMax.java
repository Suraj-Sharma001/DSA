import java.util.*;
public class ArrayMax {

    public static int PrintArrayMax(int arr[], int idx) {
        // base case
        if(idx == arr[arr.length-1])
        {
            return arr[idx];
        }   

        // recursive work
        int smallAns = PrintArrayMax(arr, idx+1);

        // self work
        return Math.max(arr[idx], smallAns);

    }
    public static void main(String[] args) {
        int arr[] = {3, 10, 11, 2};
        System.out.println(PrintArrayMax(arr, 0));
    }
}
