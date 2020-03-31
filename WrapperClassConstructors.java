public class WrapperClassConstructors {
    public static void main(String[] args) {
        Byte b1=new Byte("115");
        System.out.println(b1);
        byte b=101;
        Byte b2=new Byte(b);
        System.out.println(b2);
        Byte b3=new Byte((byte)127);
        System.out.println(b3);
        short s=31675;
        Short s1=new Short(s);
        Short s2=new Short("23451");
        Short s3=new Short((short)25467);
        System.out.println(s3);
        System.out.println(s1+"\t"+s2);
        Integer i1=new Integer(10);
        Integer i2=new Integer("214736");
        System.out.println(i1+"\t"+i2);
        Long l1=new Long(1546987l);
        System.out.println(l1);
        Long l2=new Long("27687227782");
        System.out.println(l2);
        Float f1=new Float(10.5f);
        System.out.println(f1);
        Float f2=new Float("765.456f");
        System.out.println(f2);
        Float f3=new Float(107.675);
        System.out.println(f3);
        Character c1=new Character('K');
        System.out.println(c1);
        Boolean bo1=new Boolean("Yes");
        Boolean bo2=new Boolean("No");
        Boolean bo3=new Boolean("True");
        Boolean bo4=new Boolean("true");
        Boolean bo5=new Boolean("False");
        Boolean bo6=new Boolean("false");
        Boolean bo7=new Boolean(true);
        Boolean bo8=new Boolean(false);
        System.out.println(bo1.equals(bo2));
        System.out.println(bo2.equals(bo3));
        System.out.println(bo3.equals(bo4));
        System.out.println(bo4.equals(bo5));
        System.out.println(bo5.equals(bo6));
        System.out.println(bo6.equals(bo7));
        System.out.println(bo7.equals(bo8));


    }
}
