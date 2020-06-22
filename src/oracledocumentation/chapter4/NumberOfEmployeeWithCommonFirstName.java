package oracledocumentation.chapter4;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem-- Consider the four core interfaces, Set, List, Queue, and Map.
 * For each of the following four assignments, specify which of the four core
 * interfaces is best-suited, and explain how to use it to implement the assignment.
 * <p-III>
 * WTI decides that it only wants to use the most popular names for its toys.
 * Count up the number of employees who have each first name.
 */
public class NumberOfEmployeeWithCommonFirstName {
    public static void main(String[] args) {
        int count = 1;
        Map<String, Integer> employeeWithFirstName = new HashMap<>();
        Emplyoee[] emplyoee = {new Emplyoee("Karan Dev"), new Emplyoee("Lokesh Yadav"),
                new Emplyoee("Ramesh Kumar"), new Emplyoee("Kamli Kannun"),
                new Emplyoee("Kiran Chawani"), new Emplyoee("Mahadevan Kumar"),
                new Emplyoee("Karan Dev")};
        for (Emplyoee currentEmployee : emplyoee) {
            String[] name = currentEmployee.name.split(" ");
            String emplyoeeFirstName = name[0];
            if (employeeWithFirstName.containsKey(emplyoeeFirstName)) {
                count++;
                employeeWithFirstName.put(emplyoeeFirstName, count);
            } else employeeWithFirstName.put(emplyoeeFirstName, count);
        }
        System.out.println(employeeWithFirstName);
    }
}
