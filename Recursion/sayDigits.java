package Recursion;

import java.util.Scanner;

public class sayDigits {

    static void sayDig(int n, String[] str) {
        if(n == 0) return;
        int dig = n%10;
        n = n/10;
        sayDig(n, str);
        System.out.print(str[dig] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = {"Zero", "One", "Two", "Three", "Four",
        "Five", "Six", "Seven", "Eight", "Nine"};

        sayDig(n, str);
    }
}
