package programminganddatastructure;

import java.util.Scanner;

public class MainClass {
    /**
     * Tihs is simply main method of the program
     * @param args--this is command line argument
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        String expr = scanner.nextLine();
        ExpressionParser expressionParser = new ExpressionParser(expr);
        ExpressionEvaluator evaluator = new ExpressionEvaluator(expressionParser);
        String updatedExpression = evaluator.getVariablesWithValue();
        System.out.println(evaluator.evaluteExpression(updatedExpression));
    }
}
