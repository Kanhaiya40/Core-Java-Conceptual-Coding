import java.lang.reflect.Method;

public class GetClassMethod {
    public void m1()
    {
        System.out.println("This is Method2");
    }
    public void m2()
    {
        System.out.println("This is Method3");
    }
    public void m3()
    {
        System.out.println("This is Method3");
    }
    public static void main(String[] args) {
        GetClassMethod g1=new GetClassMethod();
        Class c=g1.getClass();
        Method[] m1=c.getDeclaredMethods();
        int count=0;
        for (Method m2:m1
             ) {
            System.out.println(count+"\t"+m2.getName()+"()");
            count++;
        }
        System.out.println("Total no of Methods"+count);
        System.out.println(c.getSuperclass());
    }
}
