package expression_evaluation;

import java.util.*;

/**
 * It Takes Expression from main class and Parse it
 * Then updated expression it gives to ExpressionEvaluator class
 */
public class ExpressionParser {

    private final String expression;

    private final Set<String> variables = new HashSet<>();

    public ExpressionParser(String expression) {
        this.expression = expression;
    }

    public Stack<Token> parse() {

        Stack<Token> postFix = new Stack<>();
        Stack<Token> temporaryStack = new Stack<>();
        Operator operator = new Operator("");
        for (Token token : getTokens()) {
            if (token instanceof Operand) {
                if (token instanceof Variable) {
                    variables.add(((Variable) token).getValue());
                    postFix.push((token));
                } else if (token instanceof Value) {
                    postFix.push(token);
                }
            } else if (token instanceof Operator && operator.hasPrecedence(((Operator) token).getValue()) != 0
                    && operator.hasPrecedence(((Operator) token).getValue()) != 3) {
                while (!temporaryStack.isEmpty() && operator.hasPrecedence(((Operator) temporaryStack.peek()).getValue())
                        > operator.hasPrecedence(((Operator) token).getValue())
                        && operator.hasPrecedence(((Operator) temporaryStack.peek()).getValue()) != 0) {
                    postFix.push(temporaryStack.pop());
                }
                temporaryStack.push(token);
            } else if (token instanceof Operator && operator.hasPrecedence(((Operator) token).getValue()) == 3) {
                Token currentToken = temporaryStack.pop();
                while (operator.hasPrecedence(((Operator) currentToken).getValue()) != 0) {
                    postFix.push(currentToken);
                    currentToken = temporaryStack.pop();
                }
            } else if (token instanceof Operator && operator.hasPrecedence(((Operator) token).getValue()) == 0) {
                temporaryStack.push(token);
            } else {
                postFix.push(token);
            }
        }
        while (!temporaryStack.isEmpty()) {
            postFix.push(temporaryStack.pop());
        }
        return postFix;
    }

    public Set<String> getVariables() {
        return variables;
    }

    private boolean isNumber(String numericStringValue) {
        boolean numeric = true;
        try {
            Double.parseDouble(numericStringValue);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }

    private List<Token> getTokens() {
        List<Token> listOfTokens = new ArrayList<>();
        String[] tokens = expression.split("((?<=\\+)|(?=\\+))|((?<=-)|(?=-))"
                + "|((?<=\\*)|(?=\\*))|((?<=/)|(?=/))"
                + "|((?<=\\()|(?=\\())|((?<=\\))|(?=\\)))");
        for (String token : tokens) {
            if (token.matches("[a-zA-z]+")) {
                listOfTokens.add(new Variable(token));
            } else if (isNumber(token)) {
                listOfTokens.add(new Value(Double.parseDouble(token)));
            } else
                listOfTokens.add(new Operator(token));
        }
        return listOfTokens;
    }
}

