package Stack;
import java.util.*;

public class balanceBrackets {

    public static boolean handleClosing(Stack<Character>st, char currospondingOpeningChar){
        if(st.size()==0){
            return false;
        } else if(st.peek()!=currospondingOpeningChar){
            System.out.println(false);
            return false;
        } else {
            st.pop();
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '('|| ch == '{'|| ch == '['){
                st.push(ch);
            } else if(ch == ')'){
                boolean val = handleClosing(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            } else if(ch == '}'){
                boolean val = handleClosing(st, '{');if(val == false){
                    System.out.println(val);
                    return;
                }

            } else if(ch == ']'){
                boolean val = handleClosing(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }
        if(st.size()==0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
