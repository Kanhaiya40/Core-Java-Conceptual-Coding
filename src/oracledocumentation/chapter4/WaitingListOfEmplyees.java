package oracledocumentation.chapter4;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Problem-- Consider the four core interfaces, Set, List, Queue, and Map.
 * For each of the following four assignments, specify which of the four core
 * interfaces is best-suited, and explain how to use it to implement the assignment.
 * <p-IV>
 * WTI acquires season tickets for the local lacrosse team, to be shared by employees.
 * Create a waiting list for this popular sport.
 */
public class WaitingListOfEmplyees {
    public static void main(String[] args) {
        Queue<String> emplyoeeWithTicket = new PriorityQueue<>();
        Queue<String> waitingListOfEmployee = new PriorityQueue<>();
        waitingListOfEmployee.add("Lokesh Yadav");
        waitingListOfEmployee.add("Ramesh Kumar");
        waitingListOfEmployee.add("Suresh Prbhu");
        waitingListOfEmployee.add("Ramu Jayesh");
        waitingListOfEmployee.add("Vishal Mishra");
        waitingListOfEmployee.add("Kamayani Dev");
        waitingListOfEmployee.add("Shahu Shankar");
        System.out.println("waitingListOfEmployee:" + waitingListOfEmployee);
        while (waitingListOfEmployee.size() != 0) {
            System.out.println("emplyoeeWithTicket:" + emplyoeeWithTicket);
            emplyoeeWithTicket.add(waitingListOfEmployee.remove());
            System.out.println("waitingListOfEmployee:" + waitingListOfEmployee);
        }
    }
}
