package Arrayproblem;
import java.util.*;

public class Repeat {

    public static int findRepeat(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; i++) {
                if(arr[j] == arr[i]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(findRepeat(arr));
    }
}
