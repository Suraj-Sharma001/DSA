package Stack;

import java.util.*;

public class infixEval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                operator.push(ch);
            } else if (Character.isDigit(ch)) {
                operands.push(ch-'0');
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char oprt = operator.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();
                    int opv = operation(v1, v2, oprt);
                    operands.push(opv);
                }
                operator.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
                    char oprt = operator.pop();
                    int v1 = operands.pop();
                    int v2 = operands.pop();
                    int opv = operation(v1, v2, oprt);
                    operands.push(opv);
                }
                operator.push(ch);
            }
        }
        while (operator.size() != 0) {
            char oprt = operator.pop();
            int v1 = operands.pop();
            int v2 = operands.pop();
            int opv = operation(v1, v2, oprt);
            operands.push(opv);
        }
        System.out.println(operands.peek());
    }

    
    public static int precedence(char oprt) {
        if (oprt == '+') {
            return 1;
        } else if (oprt == '-') {
            return 1;
        } else if (oprt == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operation(int v1, int v2, char oprt) {
        if (oprt == '+') {
            return v1 + v2;
        }
        else if (oprt == '-') {
            return v1 - v2;
        }
        else if (oprt == '*') {
            return v1 * v2;
        }
        else {
            return v1 / v2;
        }
    }
}