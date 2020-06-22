package programminganddatastructure;

import java.util.Map;
import java.util.StringTokenizer;

/**
 * It Takes Expression from main class and Parse it
 * Then updated expression it gives to ExpressionEvaluator class
 */
public class ExpressionParser {
    /**
     * @param values--Map            that Contains Values Of Variable
     * @param expression--Expression to parse
     * @return--updated String
     */
    public String getParsed(Map<String, Number> values, String expression) {
        String updateExpression = expression;
        StringTokenizer strings = new StringTokenizer(expression, "+-*/[]() ");
        do {
            String token = strings.nextToken();
            if (values.containsKey(token)) {
                updateExpression = updateExpression.replace(token, String.valueOf(values.get(token)));
            }
        } while (strings.hasMoreElements());
        return updateExpression;
    }
}
