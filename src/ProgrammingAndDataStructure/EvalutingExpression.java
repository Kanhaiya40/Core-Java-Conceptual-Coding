package ProgrammingAndDataStructure;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem--
 * Expression parsing and evaluation
 * Parse and evaluate expressions of the form (a + b)*(c-d)
 * Support binary arithmetic operations, parenthesis and operator precedence
 */
public class EvalutingExpression {
    static Scanner scanner = new Scanner(System.in);
    static Stack<Character> stack = new Stack<>();      // to hold operators only
    static Stack<Integer> variablesValue = new Stack<>();  // to hold numerical value

    /**
     * @param a--It  is first top value of Integral stack
     * @param b--It  is second top value of Integral stack
     * @param op--It is top of character stack
     */
    public static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

    /**
     * @param ch--It is operator on which we are performing operator precedence operation
     */
    public static int operatorPrecedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;        /* It Returns One And This is Trailing Commnets */
        if (ch == '/' || ch == '*')
            return 2;
        return 0;
    }

    /**
     * This function is common throughout the excecution
     */
    public static void performCommonOperation() {
        int value1;
        int value2;
        char operator;
        value1 = variablesValue.peek();
        variablesValue.pop();
        value2 = variablesValue.peek();
        variablesValue.pop();
        operator = stack.peek();
        stack.pop();
        variablesValue.push(applyOp(value1, value2, operator));

    }

    public static String parseExpression(String expression) {
        String updatedExpression = expression;
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            System.out.print(matcher.group() + "=");
            updatedExpression = updatedExpression.replace(matcher.group(), scanner.nextLine());
        }
        return updatedExpression;
    }

    /**
     * In this method we are passing expression after that
     * this method execution we are getting value of the expression
     * for which we are performing this program
     *
     * @param expression--It is given by user
     */
    public static int evaluteExpression(String expression) {
        char[] tokens = expression.toCharArray();
        for (Character ch : tokens
        ) {
            if (ch == '(') {
                stack.push(ch);
            } else if (Character.isDigit(ch)) {
                int var = Integer.parseInt(String.valueOf(ch));
                variablesValue.push(var);
            } else if (ch == '*' || ch == '-' || ch == '/' || ch == '+') {
                while (!stack.isEmpty() && operatorPrecedence(stack.peek()) >= operatorPrecedence(ch)) {
                    performCommonOperation();
                }
                stack.push(ch);
            } else {
                performCommonOperation();
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

        }
        while (!stack.isEmpty()) {
            performCommonOperation();
        }
        return variablesValue.peek();
    }

    /**
     * Tihs is simply main method of the program
     *
     * @param args--this is command line argument
     */
    public static void main(String[] args) {
        String expression = scanner.nextLine();
        System.out.println("Given Expression is:");
        System.out.println(expression);
        System.out.println(evaluteExpression(parseExpression(expression)));
    }
}
