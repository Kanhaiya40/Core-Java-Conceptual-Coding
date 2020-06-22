package oracledocumentation.chapter5;

import java.time.LocalDate;
import java.time.Period;

public class MyAge {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1998, 1, 26);
        LocalDate currentDate = LocalDate.now();
        Period difference = Period.between(birthDate, currentDate);
        System.out.println("I am " + difference.getYears() + " years old");
    }
}
