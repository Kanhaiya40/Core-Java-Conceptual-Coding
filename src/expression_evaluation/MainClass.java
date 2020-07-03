package expression_evaluation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
    /**
     * This is simply main method of the program
     *
     * @param args--this is command line argument
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner Object
        System.out.println("Enter an expression: ");
        String expression = scanner.nextLine();  // Taking input as expression
        ExpressionEvaluator evaluator = new ExpressionEvaluator(expression);
        Set<String> variables = evaluator.getVariables();
        Map<String, Double> values = new HashMap<>();
        for (String variable : variables) {
            System.out.println("Enter Value for " + variable + ":");
            values.put(variable, scanner.nextDouble());
        }
        System.out.println(evaluator.evaluate(values));
    }
}
