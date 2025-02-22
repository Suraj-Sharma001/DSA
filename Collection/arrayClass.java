package Collection;

import java.util.Arrays;
import java.util.Collections;

public class arrayClass {
    public static void main(String[] args) {
        // algorithm used in array data structure

        // 01. Find the idx of key in binarySearch
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(arr1, 5);
        System.out.println(index);

        // 02. Sort the array
        int arr2[] = {2, 4, 6, 1, 9, 5, 0};
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // 03. Fill the initial value in Array
        int arr3[] = new int [5];
        Arrays.fill(arr3, -1);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        // Some of the algo of collection are as follows:
        //01. Collections.max(list);
        //02. Collections.min(list);
        //03. Collections.sort(list, Comparator.reverseOrder()); -> reverse order
        //04.
    }
}
