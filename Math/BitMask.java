package Math;

import java.util.Scanner;

public class BitMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();

        int onMask = (1 << i);
        int offMask = ~(1 << j);
        int toggleMask = (1 << k);
        int cMask = (1 << l);

        System.out.println(n | onMask);
        System.out.println(n & offMask);
        System.out.println(n ^ toggleMask);
        System.out.println((n & cMask) == 0 ? false : true);
    }
}
