package Math;

/*
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3^x.



Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
* */

import java.util.Scanner;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n){
        if(n <= 0) return false;
        while(n % 3 == 0){
            n = n/3;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = isPowerOfThree(n);
        System.out.println(ans);
    }
}
