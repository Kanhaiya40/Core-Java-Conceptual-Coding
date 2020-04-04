import java.util.Comparator;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack s1=new Stack();
        System.out.println(s1.empty());
        s1.push("Kanhiya");
        s1.push("Vishal");
        s1.push("Ramesh");
        s1.push("Suresh");
        s1.push("Asfaque");
        s1.push("Parwej");
        s1.add("Abhisheck");
        s1.sort(new Comparator() {
            @Override
            public int compare(Object o, Object t1) {
                String s1=o.toString();
                String s2=t1.toString();
                return s1.compareTo(s2);
            }
        });

        System.out.println(s1.peek());
        System.out.println(s1);
        System.out.println(s1.search("Abhisheck"));
    }
}
