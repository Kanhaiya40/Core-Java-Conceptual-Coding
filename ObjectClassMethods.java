import java.lang.reflect.Method;

public class ObjectClassMethods {
    public static void main(String[] args) {
        Object o1=new Object();
        Class c=o1.getClass();
        int count=0;
        Method[]  m1=c.getDeclaredMethods();
        for (Method m2:m1
             ) {
            System.out.println(count+"\t"+m2.getName()+"()");
            count++;
        }
        System.out.println("No of Methods:"+count);

    }
}
