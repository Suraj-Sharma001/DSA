import java.util.*;
public class SunArray {
    
    public static int SumOfArray(int arr[], int idx) {
        // base case
        if(idx == arr[arr.length-1])
        {
            return arr[idx];
        }   

        // recursive work
        int smallAns = SumOfArray(arr, idx+1);

        // self work
        return smallAns+arr[idx];

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(SumOfArray(arr, 0));
    }
}
