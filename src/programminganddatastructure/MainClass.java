package programminganddatastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
    /**
     * Tihs is simply main method of the program
     *
     * @param args--this is command line argument
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner Object
        System.out.println("Enter an expression: ");
        String expr = scanner.nextLine();  // Taking input as expression
        ExpressionEvaluator evaluator = new ExpressionEvaluator(expr);
        Set<String> variables = evaluator.setOfVariables();
        Map<String, Number> values = new HashMap<>();
        for (String variable : variables) {
            System.out.println("Enter Value for " + variable + ":");
            values.put(variable, scanner.nextInt());
        }
        System.out.println("Value :" + evaluator.evaluateExpression(values));
    }
}
