package BinarySearch;

import java.util.*;

public class rsa {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,0,1,2};
        int n = arr.length;
        int target = 2;

        int st = 0;
        int end = n-1;

        while(st<=end) {
            int mid = st+(end-st)/2;
            if(arr[mid] == target){
                System.out.println(mid);
            }
            if(arr[st] < arr[mid]){
                if(arr[st] <= target && arr[mid] > target){
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            } else {
                if(arr[mid] < target && arr[end] >= target) {
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
    }
}