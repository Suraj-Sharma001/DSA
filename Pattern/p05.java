package Pattern;

import java.util.Scanner;

public class p05 {
    public static void main(String[] args) {

        /*   Print following pattern
         *
         * *
         * * *
         * * * *
         * * *
         * *
         *           */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < 2*n; i++) {
            int k = i > n ? 2*n-i : i;
            for (int j = 0; j < k; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
