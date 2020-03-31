import java.lang.reflect.Method;

public class GetStringMethod {
    public static void main(String[] args) {
        String s1=new String() ;
        Class c=s1.getClass();
        Method[] m1=c.getDeclaredMethods();
        int count=1;
        for (Method m2:m1
             ) {
            System.out.println(count+"\t"+m2.getName()+"()");
            count++;

        }
    }
}
