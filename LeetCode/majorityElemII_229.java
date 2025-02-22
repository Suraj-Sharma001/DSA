package LeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class majorityElemII_229 {

    static ArrayList<Integer> MajorityElementII(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int c1 = 0;
        int c2 = 0;
        int m1 = 0;
        int m2 = 0;

        for(int i : arr) {
            if(arr[i] == m1){
                c1++;
            } else if(arr[i] == m2){
                c2++;
            } else if(c1 == 0){
                m1 = arr[i];
                c1 = 1;
            } else if(c2 == 0){
                m2 = arr[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        int f1 = 0;
        int f2 = 0;
        for (int j : arr) {
            if (j == m1) {
                f1++;
            } else if (j == m2) {
                f2++;
            }
        }

        if(f1 > (n/3)){
            ans.add(m1);
        }

        if(f2 > (n/3)){
            ans.add(m2);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ans = MajorityElementII(arr);
        for(Integer i : ans){
            System.out.print(i + " ");
        }
    }
}
