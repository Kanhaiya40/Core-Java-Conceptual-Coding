package programminganddatastructure;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem--
 * Expression parsing and evaluation
 * Parse and evaluate expressions of the form (a + b)*(c-d)
 * Support binary arithmetic operations, parenthesis and operator precedence
 */
public class ExpressionEvaluator {
    private final String expression;
    private final Stack<Character> stack = new Stack<>();      // to hold operators only
    private final Stack<Integer> variablesValue = new Stack<>();  // to hold numerical value
    private final ExpressionParser expressionParser;  // created instance of Expression parser Object

    ExpressionEvaluator(String expression) {
        this.expression = expression;
        expressionParser = new ExpressionParser();
    }

    private static boolean isNumeric(String token) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(token);
        return matcher.matches();
    }

    /**
     * @param op1--Operator 1
     * @param op2--Operator 2
     */
    private static boolean operatorPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
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

    public Set<String> setOfVariables() {
        Set<String> onlyVariables = new HashSet<>();
        StringTokenizer strings = new StringTokenizer(expression, "+-*/[]() ");
        do {
            String token = strings.nextToken();  // Taking one token at a time
            if (isNumeric(token)) {
                System.out.print("");
                // if a string is numeric then do nothing continue the flow of prgram
            } else {
                onlyVariables.add(token);
            }
        } while (strings.hasMoreElements());
        return onlyVariables;
    }

    /**
     * In this method we are passing expression after that
     * this method execution we are getting value of the expression
     * for which we are performing this program
     */
    public Number evaluateExpression(Map<String, Number> values) {
        String updatedExpression = expressionParser.getParsed(values, expression);
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
                while (!stack.empty() && operatorPrecedence(tokens[i], stack.peek()))
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
     * This function is common throughout the excecution
     */
    private void performCommonOperation() {
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
}
