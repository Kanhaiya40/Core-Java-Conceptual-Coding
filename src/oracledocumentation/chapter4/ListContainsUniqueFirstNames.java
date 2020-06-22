package oracledocumentation.chapter4;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem-- Consider the four core interfaces, Set, List, Queue, and Map.
 * For each of the following four assignments, specify which of the four core
 * interfaces is best-suited, and explain how to use it to implement the assignment.
 * <p-II>
 * WTI has decided that each new product will be named after an employee —
 * but only first names will be used, and each name will be used only once.
 * Prepare a list of unique first names.
 */
public class ListContainsUniqueFirstNames {
    public static void main(String[] args) {
        Set<String> uniqueFirstNameOfEmployee = new HashSet<>();
        Emplyoee[] emplyoee = {new Emplyoee("Karan Dev"), new Emplyoee("Lokesh Yadav"),
                new Emplyoee("Ramesh Kumar"), new Emplyoee("Kamli Kannun"),
                new Emplyoee("Kiran Chawani"), new Emplyoee("Mahadevan Kumar"), new Emplyoee("Karan Dev")};
        for (Emplyoee currentEmployee : emplyoee
        ) {
            String[] name = currentEmployee.name.split(" ");
            String emplyoeeFirstName = name[0];
            uniqueFirstNameOfEmployee.add(emplyoeeFirstName);
        }
        System.out.println(uniqueFirstNameOfEmployee);
    }
}
