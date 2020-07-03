package expression_evaluation;

public class Variable extends Operand {

    private final String variable;

    Variable(String variable) {
        this.variable = variable;
    }

    public String getValue() {
        return this.variable;
    }

}
