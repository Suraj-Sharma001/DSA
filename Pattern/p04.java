package Pattern;

import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {

        /*   Print following pattern
         * * * * *
         * * * *
         * * *
         * *
         *            */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j = n; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
