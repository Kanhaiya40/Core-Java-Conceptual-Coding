package oracledocumentation.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class RegexExpressionWithValidationCheck {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher("37678ajjg");
        if (matcher.find()) {
            System.out.println("Given string Contains Digit in it");
        }
        Pattern pattern1 = Pattern.compile("\\s");
        Matcher matcher1 = pattern1.matcher("3767   8ajjg");
        if (matcher1.find()) {
            System.out.println("Given string Contains space in it");
        }
        Pattern pattern2 = Pattern.compile("\\w");
        Matcher matcher2 = pattern2.matcher("37678ajjg");
        if (matcher2.find()) {
            System.out.println("Given string Contains any word character in it");
        }
    }
}
