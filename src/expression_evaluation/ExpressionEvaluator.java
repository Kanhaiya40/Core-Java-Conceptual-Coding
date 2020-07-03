package expression_evaluation;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ExpressionEvaluator {

    private final ExpressionParser expressionParser;
    private final Stack<Token> postFix;
    private final Stack<Double> stackWithDoubleValue = new Stack<>();

    ExpressionEvaluator(String expression) {
        this.expressionParser = new ExpressionParser(expression);
        postFix = expressionParser.parse();
    }

    private static double applyOp(double lhs, double rhs, char operator) {
        switch (operator) {
            case '+':
                return lhs + rhs;
            case '-':
                if (lhs > rhs)
                    return lhs - rhs;
                else return rhs - lhs;
            case '*':
                return lhs * rhs;
            case '/':
                return lhs / rhs;
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
                stackWithDoubleValue.push(variablesWithValue.get(((Variable) instantPosition).getValue()));
            } else if (instantPosition instanceof Value && isNumber(((Value) instantPosition).getValue().toString())) {
                stackWithDoubleValue.push(Double.parseDouble(((Value) instantPosition).getValue().toString()));
            } else if (instantPosition instanceof Operator)
                performCommonOperation(((Operator) instantPosition).getValue().charAt(0));
        }
        return stackWithDoubleValue.peek();
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

    private void performCommonOperation(char operate) {
        double firstElementOfStack;
        double secondElementOfStack;
        firstElementOfStack = stackWithDoubleValue.pop();
        secondElementOfStack = stackWithDoubleValue.pop();
        stackWithDoubleValue.push(applyOp(firstElementOfStack, secondElementOfStack, operate));
    }
}