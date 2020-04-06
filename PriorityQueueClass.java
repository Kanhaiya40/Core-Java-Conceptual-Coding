import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue p1=new PriorityQueue();
        System.out.println(p1.peek());
       // System.out.println(p1.element());
        System.out.println(p1.poll());
       // System.out.println(p1.remove());
        p1.offer("Kanhaiya");
        p1.offer("Ahuti");
        p1.offer("Kunal");
        p1.offer("Kishore");
        p1.offer("Sayan");
        p1.offer("Anita");
        p1.offer("Vijay");
        System.out.println(p1);
        System.out.println(p1.poll());
        //System.out.println(p1.remove());
        System.out.println(p1);
    }
}
