package Recursion;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(char[] arr, int i, int j) {
        if(i > j){
            return true;
        }

        if(arr[i] != arr[j]){
            return false;
        } else {
            return isPalindrome(arr, i+1, j-1);
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
         String str = sc.next();
        char[] arr = str.toCharArray();
         boolean ans = isPalindrome(arr, 0, str.length()-1);

         if(ans) {
             System.out.println("Palindrome hai!!");
         } else {
             System.out.println("Palindrome nhi hai!!");
         }
    }
}
