package oracledocumentation.chapter4;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        System.out.println(queue);
        for (int i = 10; i > 0; i--) {
            queue.remove();
        }
        System.out.println(queue);
    }
}
