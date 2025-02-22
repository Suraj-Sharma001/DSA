package Recursion;

import java.util.Scanner;

public class linearSearch {

    static boolean isKeyExist(int []arr, int idx, int key, int n) {
        if(idx == n) return false;

        if(arr[0] == key) {
            return true;
        } else {
            return isKeyExist(arr, idx+1, key, n);
        }
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int []arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            boolean ans = isKeyExist(arr, 0, key, n);
            System.out.println(ans);
        }
    }
