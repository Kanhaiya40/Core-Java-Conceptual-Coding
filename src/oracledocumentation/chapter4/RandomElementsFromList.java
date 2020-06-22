package oracledocumentation.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Problem-- Consider the four core interfaces, Set, List, Queue, and Map.
 * For each of the following four assignments, specify which of the four core
 * interfaces is best-suited, and explain how to use it to implement the assignment.
 * <p-I>
 * --Whimsical Toys Inc (WTI) needs to record the names of all its employees.
 * Every month, an employee will be chosen at random from these records to receive a free toy
 */
public class RandomElementsFromList {
    public static void main(String[] args) {
        List<Emplyoee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(new Emplyoee("Lokesh Yadav"));
        listOfEmployee.add(new Emplyoee("Ramesh Kumar"));
        listOfEmployee.add(new Emplyoee("Suresh Prbhu"));
        listOfEmployee.add(new Emplyoee("Ramu Jayesh"));
        listOfEmployee.add(new Emplyoee("Vishal Mishra"));
        listOfEmployee.add(new Emplyoee("Kamayani Dev"));
        listOfEmployee.add(new Emplyoee("Shahu Shankar"));
        System.out.println(listOfEmployee);
        Random random = new Random();
        Emplyoee randomEmployee = listOfEmployee.get(random.nextInt(listOfEmployee.size()));
        System.out.println(randomEmployee);
    }
}
