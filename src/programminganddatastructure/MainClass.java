package programminganddatastructure;

import java.util.Scanner;

public class MainClass {
    /**
     * Tihs is simply main method of the program
     * @param args--this is command line argument
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner Object
        System.out.println("Enter an expression: ");
        String expr = scanner.nextLine();  // Taking input as expression
        ExpressionParser expressionParser = new ExpressionParser(expr);  // passing expression variable to ExpressionParser Object
        ExpressionEvaluator evaluator = new ExpressionEvaluator(expressionParser);  // passing ExpressionParser Object to ExpressionEvaluator Object
        String updatedExpression = evaluator.getVariablesWithValue();   // Extracting updated expression from getVariablesWithValue() method of ExpressionEvaluator class
        System.out.println(evaluator.evaluteExpression(updatedExpression)); // calling evalueExpression Of ExpressionEvaluator class
    }
}
