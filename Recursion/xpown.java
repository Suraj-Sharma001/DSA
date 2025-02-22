package Recursion;

import java.util.Scanner;

public class xpown {

    public static long findXpowN(int x, int n) {
        if(n == 0){
            return 1;
        }

        if(n == 1) {
            return x;
        }

        long ans = findXpowN(x, n/2);

        if(n % 2 == 0) {
            return ans*ans;
        } else {
            return x*ans*ans;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(243*243*3);
        int x = sc.nextInt();  // num
        int n = sc.nextInt(); // power

        long ans = findXpowN(x, n);
        System.out.println(ans);
    }
}
