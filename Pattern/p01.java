package Pattern;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        //Print following pattern
        /*  *****
            *****
            *****
            *****   */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
