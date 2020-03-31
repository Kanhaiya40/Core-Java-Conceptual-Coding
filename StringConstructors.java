public class StringConstructors {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Kanhaiya");
        StringBuffer s2=new StringBuffer("Kanhaiya");
        String s3=new String("Mohan");
        String s4=new String("Mohan");
        System.out.println(s3==s4);
        System.out.println(s1==(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s1.equals(s2));
        char[] a1={'a','b','c','d'};
        String s5=new String(a1);
        System.out.println(s5);
        byte[] b={101,110,125,127,-128,-117};
        String s6=new String(b);
        System.out.println(s6);
        String s7=new String(s3);
        System.out.println(s7);
        System.out.println(s7==s4);
        System.out.println(s7.equals(s4));


    }
}
