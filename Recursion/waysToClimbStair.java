package Recursion;

import java.util.Scanner;

public class waysToClimbStair {

    static int countWaysToClimbStair(int n) {
        if(n < 0) return 0;
        if( n == 0) return 1;

        return countWaysToClimbStair(n-1) + countWaysToClimbStair(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = countWaysToClimbStair(n);
        System.out.println(ans);
    }
}
