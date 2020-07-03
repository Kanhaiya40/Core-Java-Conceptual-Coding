package expression_evaluation;

public class Value extends Operand {

    private final Double value;

    Value(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

}
