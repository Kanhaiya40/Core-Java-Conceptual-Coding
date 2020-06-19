package programminganddatastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ExpressionParser {
    private final String expression;

    ExpressionParser(String expression) {
        this.expression = expression;
    }

    public String getVariables() {
        String updatedExpression = expression;
        Map<String, Number> values = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        StringTokenizer strings = new StringTokenizer(expression, "+-*/[]() ");
        do {
            String token = strings.nextToken();
            boolean isNumeric = token.chars().allMatch(Character::isDigit);
            if (isNumeric) {
                continue;
            } else {
                System.out.print("Enter value for  " + token + ":");
                values.put(token, scanner.nextInt());
            }
            if (values.containsKey(token)) {
                updatedExpression = updatedExpression.replace(token, String.valueOf(values.get(token)));
            }
        } while (strings.hasMoreElements());
        return updatedExpression;
    }
}
