package Stack;

import java.util.Scanner;
import java.util.Stack;

public class duplicateBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
                if(ch == ')') {
                    if(st.peek() == '(') {
                        System.out.print("Contain unnecessary duplicate bracket!");
                        return;
                    } else {
                        while(st.peek() != '(') {
                            st.pop();
                        }
                        st.pop();
                    }
                } else {
                    st.push(ch);
                }
            }
        System.out.print("Does not contain unnecessary duplicate bracket!");
    }
}
