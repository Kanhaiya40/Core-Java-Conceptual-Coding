package expression_evaluation;

public class Operator implements Token {

    private final String symbol;

    public Operator(String symbol) {
        this.symbol = symbol;
    }

    public int hasPrecedence(String symbol) {
        switch (symbol) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "(":
                return 0;
            default:
                return 3;
        }
    }

    public String getValue() {
        return symbol;
    }

}
