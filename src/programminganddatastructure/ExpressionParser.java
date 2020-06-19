package programminganddatastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * It Takes Expression from main class and Parse it
 * Then updated expression it gives to ExpressionEvaluator class
 */
public class ExpressionParser {
    private final String expression;   // expression variable

    ExpressionParser(String expression) {   // passing expression variable to paramatrised constructor
        this.expression = expression;
    }

    public String getVariables() {
        String updatedExpression = expression; // updated expression variable
        Map<String, Number> values = new HashMap<>();  // A Map to store variable and value of variable
        Scanner scanner = new Scanner(System.in);
        // StringTokenizer class to split expression to get  variable from expression
        StringTokenizer strings = new StringTokenizer(expression, "+-*/[]() ");
        do {
            String token = strings.nextToken();  // Taking one token at a time
            boolean isNumeric = token.chars().allMatch(Character::isDigit);  // variable to check a String is numeric or not
            if (isNumeric) {
                continue; // if a string is numeric then do nothing continue the flow of prgram
            } else {
                System.out.print("Enter value for  " + token + ":");
                values.put(token, scanner.nextInt());  // If not Numeric then Enter the value of variable and store it into map object with variable name
            }
            /*
             * This is simply parsing of expresion
             */
            if (values.containsKey(token)) {
                updatedExpression = updatedExpression.replace(token, String.valueOf(values.get(token)));
            }
        } while (strings.hasMoreElements());
        return updatedExpression;  // passing this updated expression to ExpressionEvaluator class
    }
}
