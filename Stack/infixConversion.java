package Stack;

import java.util.*;

public class infixConversion {

    public static int precidence(char ops) {
        if (ops == '+')
            return 1;
        else if (ops == '-')
            return 1;
        else if (ops == '*')
            return 2;
        else
            return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        Stack<String> postFix = new Stack<>();
        Stack<String> preFix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            } else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                postFix.push(ch + "");
                preFix.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    char op = ops.pop();
                    String postV2 = postFix.pop();
                    String postV1 = postFix.pop();
                    String postV = postV1 + postV2 + op;
                    postFix.push(postV);
                    String preV2 = preFix.pop();
                    String preV1 = preFix.pop();
                    String preV = op + preV1 + preV2;
                    postFix.push(preV);
                }
                ops.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (ops.size() > 0 && ops.peek() != '(' && precidence(ch) <= precidence(ops.peek())) {
                    char op = ops.pop();
                    String postV2 = postFix.pop();
                    String postV1 = postFix.pop();
                    String postV = postV1 + postV2 + op;
                    postFix.push(postV);
                    String preV2 = preFix.pop();
                    String preV1 = preFix.pop();
                    String preV = op + preV1 + preV2;
                    postFix.push(preV);
                }
                ops.push(ch);
            }
        }
        while (ops.size() > 0) {
            char op = ops.pop();
            String postV2 = postFix.pop();
            String postV1 = postFix.pop();
            String postV = postV1 + postV2 + op;
            postFix.push(postV);
            String preV2 = preFix.pop();
            String preV1 = preFix.pop();
            String preV = op + preV1 + preV2;
            postFix.push(preV);
        }
        System.out.println(postFix.pop());
        System.out.println(preFix.pop());
    }
}
