package oracledocumentation.chapter4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static oracledocumentation.chapter4.Person.Sex.MALE;

/**
 * Problem--
 * Write the following enhanced for statement as a pipeline with lambda expressions.
 * Hint: Use the filter intermediate operation and the forEach terminal operation
 */
public class AggregateOperators {
    public static void main(String[] args) {
        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(new Person("Kanhaiya", LocalDate.of(1998, 1, 26), MALE, "kanhaisisteccs"));
        listOfPersons.forEach(e -> System.out.println(e.getName()));
        listOfPersons
                .stream()
                .filter(e -> e.getGender() == Person.Sex.FEMALE)
                .forEach(e -> System.out.println(e.getName()));
        for (Person p : listOfPersons) {
            if (p.getGender() == Person.Sex.MALE) {
                System.out.println(p.getName());
            }
        }
    }
}
