package programminganddatastructure;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ExpressionEvaluator {

    private final ExpressionParser expressionParser;
    private final Stack<Token> postFix;
    private final Stack<Double> stack = new Stack<>();

    ExpressionEvaluator(String expression) {
        this.expressionParser = new ExpressionParser(expression);
        postFix = expressionParser.parse();
    }

    private static double applyOp(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                if (a > b)
                    return a - b;
                else return b - a;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

    public Set<String> getVariables() {
        return expressionParser.getVariables();
    }

    public Double evaluate(Map<String, Double> variablesWithValue) {
        for (Token instantPosition : postFix) {
            if (instantPosition instanceof Variable && variablesWithValue.containsKey(((Variable) instantPosition).getValue())) {
                stack.push(variablesWithValue.get(((Variable) instantPosition).getValue()));
            } else if (instantPosition instanceof Value && isNumber(((Value) instantPosition).getValue().toString())) {
                stack.push(Double.parseDouble(((Value) instantPosition).getValue().toString()));
            } else if (instantPosition instanceof Operator)
                performCommonOperation(((Operator) instantPosition).getValue().charAt(0));
        }
        return stack.peek();
    }

    private boolean isNumber(String value) {
        boolean numeric = true;
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }

    private void performCommonOperation(char operartor) {
        double value1;
        double value2;
        value1 = stack.pop();
        value2 = stack.pop();
        stack.push(applyOp(value1, value2, operartor));
    }
}