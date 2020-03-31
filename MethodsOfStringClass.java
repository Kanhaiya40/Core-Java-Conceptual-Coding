import java.lang.reflect.Method;

public class MethodsOfStringClass {
    public static void main(String[] args) {
        String s1=new String();
        Class c1=s1.getClass();
        Method[] m1=c1.getDeclaredMethods();
        int count=1;
        for (Method m2:m1
             ) {
            System.out.println(count+"\t"+m2.getName());
            count++;
        }
        s1="This is My Laptop";
        String s2=new String("This is My Bed");

        char[] ch={s1.charAt(6),s1.charAt(15),s1.charAt(12),s1.charAt(13)};
        System.out.println(ch);
        String s3=new String(ch);
            if (s3.equals("soap")) {
                System.out.println("String Matched");

            }

        String s4=s3.concat("keeper   ");
        System.out.println(s3);

        System.out.println(s4.equalsIgnoreCase("SoapKeeper"));

        String username="rockstarkanhaiya40@gmail.com";
        String password="8294741264kk";
        System.out.println(username.equalsIgnoreCase("RoCkStarKanhaiya40@GMAil.com"));
        System.out.println(password.equals("8294741264Kk"));
        String sub=username.substring(4);
        String subs=password.substring(4,9);
        System.out.println(sub);
        System.out.println(subs);
        System.out.println(s1.length());
        System.out.println(password.replace("8294741264","Kanahiaya"));
        System.out.println(username.toUpperCase());
        System.out.println(s4.toUpperCase());
        System.out.println(s4.trim());
        System.out.println(s1.indexOf("Laptop"));



    }
}
