package Recursion;

import java.util.Scanner;

public class basic01 {

    static int findFactorial(int n){
        // base case -> the termination condition of recursive call.
        if(n == 1){
            return 1;
        }
        return n * findFactorial(n-1);
    }

    public static void main(String[] args) {
        // when a function call itself is called Recursion.

        /* let we have to find n!
        so f(n) = n * f(n-1)! is called the reccrance relation.
         */
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int fac = findFactorial(n);
            System.out.println(fac);
    }
}
