import java.util.Hashtable;

public class HashtableWithCustomizeInntialCapacity {
    public static void main(String[] args) {
        Hashtable h1=new Hashtable(21);
        Table t1=new Table(16);
        Table t2=new Table(10);
        Table t3=new Table(42);
        Table t4=new Table(52);
        Table t5=new Table(12);
        Table t6=new Table(87);
        Table t7=new Table(23);
        h1.put(t1,'A');
        h1.put(t2,'B');
        h1.put(t3,'C');
        h1.put(t4,'D');
        h1.put(t5,'E');
        h1.put(t6,'F');
        h1.put(t7,'G');
        System.out.println(h1);


    }
}
class Table {
    private int i;

    public Table(int i)
    {
        this.i=i;
    }


  /*  private Table() {

    }

    public static Table t1 = null;

    public static Table getFactory(int i) {
        if (t1 == null) {
            System.out.println("Object get Created");
            return t1 = new Table();

        } else {
            System.out.println("Object Already Created");

            return t1;

        }

    }

   */

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i+" ";
    }
}
