package Recursion;

import java.util.Scanner;

public class permutation {

    static void printAllPermutation(String str, String ans) {

        if(str.length() == '\0') {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ls = str.substring(0, i);
            String rs = str.substring(i+1);
            String rem = ls+rs;
            printAllPermutation(rem, ans + ch);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        printAllPermutation(str, "");
    }
}
