package Recursion;

import java.util.Scanner;

public class reverseString {

    public static void reverseTheString(int i, int j, char[] strArray) {
        if(i > j) {
            return;
        }

        char temp = strArray[i];
        strArray[i] = strArray[j];
        strArray[j] = temp;
        i++;
        j--;

        reverseTheString(i, j, strArray);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();

        char[] strArray = str.toCharArray();

        reverseTheString(0, str.length()-1,strArray);

        for(char i : strArray) {
            System.out.print(i);
        }
    }
}
