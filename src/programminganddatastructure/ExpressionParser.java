package programminganddatastructure;

import java.util.*;

/**
 * It Takes Expression from main class and Parse it
 * Then updated expression it gives to ExpressionEvaluator class
 */
public class ExpressionParser {

    private final String expression;
    private final Operator operator;
    private final Stack<Token> postFix = new Stack<>();
    private final Stack<Token> stack = new Stack<>();
    private final Set<String> variables = new HashSet<>();

    public ExpressionParser(String expression) {
        this.expression = expression;
        operator = new Operator("");
    }

    public Stack<Token> parse() {
        for (Token token : getTokens()) {
            if (token instanceof Operand) {
                if (token instanceof Variable) {
                    variables.add(((Variable) token).getValue());
                    postFix.push((token));
                } else if (token instanceof Value) {
                    postFix.push(token);
                }
            } else if (token instanceof Operator && operator.hasPrecedence(((Operator) token).getValue()) != 0 && operator.hasPrecedence(((Operator) token).getValue()) != 3) {
                while (!stack.isEmpty() && operator.hasPrecedence(((Operator) stack.peek()).getValue()) < operator.hasPrecedence(((Operator) token).getValue()) && operator.hasPrecedence(((Operator) stack.peek()).getValue()) != 0) {
                    postFix.push(stack.pop());
                }
                stack.push(token);
            } else if (token instanceof Operator && operator.hasPrecedence(((Operator) token).getValue()) == 3) {
                Token token1 = stack.pop();
                while (operator.hasPrecedence(((Operator) token1).getValue()) != 0) {
                    postFix.push(token1);
                    token1 = stack.pop();
                }
            } else if (token instanceof Operator && operator.hasPrecedence(((Operator) token).getValue()) == 0) {
                stack.push(token);
            } else {
                postFix.push(token);
            }
        }
        while (!stack.isEmpty()) {
            postFix.push(stack.pop());
        }
        System.out.println(postFix);
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
        String[] splitedString = expression.split("((?<=\\+)|(?=\\+))|((?<=-)|(?=-))"
                + "|((?<=\\*)|(?=\\*))|((?<=/)|(?=/))"
                + "|((?<=\\()|(?=\\())|((?<=\\))|(?=\\)))");
        for (String token : splitedString) {
            if (token.matches("[a-zA-z]+")) {
                listOfTokens.add(new Variable(token));
            } else if (isNumber(token)) {
                listOfTokens.add(new Value(Double.parseDouble(token)));
            } else
                listOfTokens.add(new Operator(token));
        }
        System.out.println(listOfTokens.toString());
        return listOfTokens;
    }
}

