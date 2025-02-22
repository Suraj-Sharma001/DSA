package Pattern;

import java.util.Scanner;

public class p08 {
    public static void main(String[] args){

        /*   Print following pattern
         * * * * * * *
           * * * * *
             * * *
               *          */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2*n; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int k = i+1; k < 2*n-i; k++) {
                System.out.print("*");
            }
            for (int l = 2*n-i+1; l < n; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
