package oracledocumentation.chapter2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * An anagram is a word or a phrase made by transposing
 * the letters of another word or phrase; for example, "parliament" is an anagram of "partial men,"
 * and "software" is an anagram of "swear oft." Write a program that figures out whether one string
 * is an anagram of another string. The program should ignore white space and punctuation.
 * output--
 * parliament	and	partia lmen	are  angram to each other
 */
public class TwoStringIsAngramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        string2 = string2.replace(" ", "");
        char[] ch = string2.toCharArray();
        char[] ch1 = string1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        if (string1.length() != string2.length())
            System.out.println("String Can't Be Angram");
        else
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != ch1[i]) {
                    System.out.println(string1 + "\tand\t " + string2 + "\tare not angram to each other");
                    break;
                }
            }
        System.out.println(string1 + "\tand\t" + string2 + "\tare  angram to each other");
    }
}
