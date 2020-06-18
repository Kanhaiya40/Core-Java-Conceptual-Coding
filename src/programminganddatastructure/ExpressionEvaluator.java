package programminganddatastructure;

import java.util.*;

/**
 * Problem--
 * Expression parsing and evaluation
 * Parse and evaluate expressions of the form (a + b)*(c-d)
 * Support binary arithmetic operations, parenthesis and operator precedence
 */
public class ExpressionEvaluator {
    static String expression;
    static Scanner scanner = new Scanner(System.in);
    static Stack<Character> stack = new Stack<>();      // to hold operators only
    static Stack<Integer> variablesValue = new Stack<>();  // to hold numerical value

    ExpressionEvaluator(String expression) {
        ExpressionEvaluator.expression = expression;
    }

    /**
     * Tihs is simply main method of the program
     *
     * @param args--this is command line argument
     */
    public static void main(String[] args) {
        System.out.println("Enter an expression: ");
        String expr = scanner.nextLine();
        ExpressionEvaluator evaluator = new ExpressionEvaluator(expr);
        Set<String> variables = evaluator.getVariables();
        Map<String, Number> values = new HashMap<>();
        for (String variable : variables) {
            System.out.print("Enter value for  " + variable + ":");
            values.put(variable, scanner.nextInt());
        }
        System.out.println(evaluteExpression(values));
    }

    /**
     * In this method we are passing expression after that
     * this method execution we are getting value of the expression
     * for which we are performing this program
     */
    private static int evaluteExpression(Map<String, Number> map) {
        String updatedExpression = expression;
        StringTokenizer strings = new StringTokenizer(updatedExpression, "+-*/[]() ");
        while (strings.hasMoreElements()) {
            String temp = strings.nextToken();
            if (map.containsKey(temp)) {
                updatedExpression = updatedExpression.replace(temp, String.valueOf(map.get(temp)));
            }
        }
        char[] tokens = updatedExpression.toCharArray();
        for (Character ch : tokens
        ) {
            if (ch == ' ') {
                continue;
            }
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
     * @param ch--It is operator on which we are performing operator precedence operation
     */
    private static int operatorPrecedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;        /* It Returns One And This is Trailing Commnets */
        if (ch == '/' || ch == '*')
            return 2;
        return 0;
    }

    /**
     * This function is common throughout the excecution
     */
    private static void performCommonOperation() {
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

    /**
     * @param a--It  is first top value of Integral stack
     * @param b--It  is second top value of Integral stack
     * @param op--It is top of character stack
     */
    private static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                if (b > a)
                    return a - b;
                else
                    return b - a;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

    private Set<String> getVariables() {
        Set<String> setOfVariables = new HashSet<>();
        StringTokenizer strings = new StringTokenizer(expression, "+-*/[]() ");
        while (strings.hasMoreElements()) {
            setOfVariables.add(strings.nextToken());
        }
        return setOfVariables;
    }
}
