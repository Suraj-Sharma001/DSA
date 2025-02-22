package Pattern;

import java.util.Scanner;

public class p06 {
    public static void main(String[] args) {

        /*   Print following pattern
             *
            **
           ***
          ****
         *****          */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for(int k = spaces+1; k <= n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
