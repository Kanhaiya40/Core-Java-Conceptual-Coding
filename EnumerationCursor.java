import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        Vector v1=new Vector();
        v1.addElement(25);
        v1.addElement(36);
        v1.addElement(23);
        v1.addElement(85);
        v1.addElement(56);
        System.out.println("This is Vector Iteration implement");
        Enumeration e2=v1.elements();
        while (e2.hasMoreElements())
        {
            Integer i1=(Integer)e2.nextElement();
            if (i1%2==0) {
                System.out.println(i1);
            }
        }
        System.out.println(s1);
        System.out.println("This Is Stack Iteration Implementation");
        Enumeration e1=s1.elements();
        while (e1.hasMoreElements())
        {
            Integer i1=(Integer)e1.nextElement();
            if(i1%2==0) {
                System.out.println(i1);
            }

        }
        System.out.println("Hashing Enumeration");
        Hashtable h1=new Hashtable();
        h1.put("Kanhaiya",10);
        h1.put("Bipul",12);
        h1.put("Rakesh",15);
        h1.put("Rohan",16);
        h1.put("Ramesh",17);
        Enumeration e3=h1.elements();
        while(e3.hasMoreElements())
        {
            System.out.println(e3.nextElement());
        }
    }
}
