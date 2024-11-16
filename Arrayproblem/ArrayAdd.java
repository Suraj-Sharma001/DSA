package Arrayproblem;
import java.util.*;

public class ArrayAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter the element of first array: ");
        for(int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the sixe of second array: ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.println("Enter elements of seconf array: ");
        for(int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
        }

        int ans[] = new int[n+m];
        for(int i=0; i<n; i++) {
            ans[i] = arr1[i];
        }
        for(int i=0; i<m; i++) {
            ans[n+i] = arr2[i];
        }

        System.out.println("Final array is: ");
        for(int i=0; i<n+m; i++) {
            System.out.print(" " + ans[i]);
        }
    }
}
