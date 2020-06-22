package oracledocumentation.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem--
 * Consider the string literal "foo".
 * What is the start index?
 * What is the end index?
 * Explain what these numbers mean.
 * ouput--
 * FirstIndex=0
 * LastIndex=3
 */
public class StartAndLastIndexOfStringThroughRegex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("foo");
        Matcher matcher = pattern.matcher("foo");
        while (matcher.find()) {
            System.out.println("FirstIndex=" + matcher.start() + "" +
                    "\nLastIndex=" + matcher.end());
        }
    }
}
