import java.util.ArrayList;

public class CommunicationOfGenricWithNonGenricClasses {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        Communicate c1=new Communicate();
        l.add("Kanhaiya");
        l.add("Kumar");
        l.add("Singh");
        c1.m1(l);
        System.out.println(l);

    }

    }
    class Communicate
    {
        public static void m1(ArrayList l)
        {
            l.add(10);
            l.add(20);
            l.add(30);
        }

    }
