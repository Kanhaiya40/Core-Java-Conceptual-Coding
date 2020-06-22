package oracledocumentation.chapter3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class SummationUsingScanning {
    public static void main(String[] args) {
        double sum = 0;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/input.txt")))) {
            scanner.useLocale(Locale.US);
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    sum = sum + scanner.nextDouble();
                } else {
                    scanner.next();
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        System.out.println(sum);

    }
}
