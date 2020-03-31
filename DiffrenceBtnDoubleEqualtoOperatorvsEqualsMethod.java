public class DiffrenceBtnDoubleEqualtoOperatorvsEqualsMethod {
    public static void main(String[] args) {
        String s1=new String("Kanhaiya");
        String s2=new String("Kanhaiya");
        StringBuilder sb1=new StringBuilder("Kanhaiya");
        StringBuilder sb2=new StringBuilder("Kanhiaya");
        StringBuffer sf1=new StringBuffer("Kanhaiya");
        StringBuffer sf2=new StringBuffer("Kanhaiya");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1==sb2);
        System.out.println(s1.equals(sb1));
        System.out.println(sf1==sf2);
        System.out.println(sf1.equals(sf2));
        System.out.println(s1==null);



    }
}
