package String;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        sb.append("aabbccbbaa");
        System.out.println(sb.length());
        // Q. String is palindrome or not

        int n = sb.length();

        for(int i = 0; i < n; i++){
            if(sb.charAt(i) == sb.charAt(n)){
                n--;
            } else {
                System.out.println("Not a palin!!");
            }
        }
        System.out.println("Palindrome hai!!");
    }
}