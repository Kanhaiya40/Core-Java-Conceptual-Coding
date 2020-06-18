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
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == ' ')
                continue;
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder stringBuilder = new StringBuilder();
                while (i < tokens.length && Character.isDigit(tokens[i]) && (tokens[i] != '+' || tokens[i] != '-' || tokens[i] != '*' || tokens[i] != '/' || tokens[i] != '(' || tokens[i] != ')' || tokens[i] != '\0')) {
                    stringBuilder.append(tokens[i++]);
                }
                i--;
                variablesValue.push(Integer.parseInt(stringBuilder.toString()));
            } else if (tokens[i] == '(')
                stack.push(tokens[i]);
            else if (tokens[i] == ')') {
                while (stack.peek() != '(')
                    performCommonOperation();
                stack.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/') {
                while (!stack.empty() && opretorPrecedence(tokens[i], stack.peek()))
                    performCommonOperation();
                stack.push(tokens[i]);
            }
        }
        while (!stack.empty())
            performCommonOperation();

        // Top of 'values' contains result, return it
        return variablesValue.pop();
    }

    /**
     * @param op1--Operator 1
     * @param op2--Operator 2
     */
    private static boolean opretorPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
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
                return a - b;
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
