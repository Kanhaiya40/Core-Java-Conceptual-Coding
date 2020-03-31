public class UtilityMethodsForWrapperClasses {
    public static void main(String[] args) {

        // valueOf()

        Integer i1=Integer.valueOf(10);
        System.out.println(i1);
        Integer i2=Integer.valueOf("101",4);
        System.out.println(i2);
        Byte b1=Byte.valueOf("110",4);
        System.out.println(b1);
        Character c1=Character.valueOf('K');
        System.out.println(c1);
        Byte b2=Byte.valueOf((byte)112);
        System.out.println(b2);
        int[] i={5,6,8,9,7};
        Integer i3=Integer.valueOf(i[3]);
        System.out.println(i3);
        Float f1=Float.valueOf("10.5");
        Float f2=new Float(10.5);
        System.out.println(f1+"\t"+f2);
        Boolean b8=Boolean.valueOf(true);



        //xxxValue()

        int i4= (int)f1.floatValue();
        System.out.println(i4);
        char c= c1.charValue();
        System.out.println(c);
        boolean b=b8.booleanValue();
        System.out.println(b);

        ///parseXxx()

        int r1=Integer.parseInt("2147463658");
        System.out.println(r1);
        float f9=Float.parseFloat("10.56");
        System.out.println(f9);
        float f8=r1+f9;
        System.out.println(f8);

        Float f6=Float.valueOf(f8);
        System.out.println(f6.getClass().getName());
        System.out.println(f8);
        Float f4=f6.floatValue();
        System.out.println(f4);

        Float f5=f6+f8+f4;
        System.out.println(f5.getClass().getName());

        double d=Double.parseDouble("1254.245");
        System.out.println(d);

        int i6=Integer.parseInt("1111",2);
        System.out.println(i6);

       boolean b6=Boolean.parseBoolean("True");
       System.out.println(b6);

       //toString()

        Integer i0=new Integer("1010");
        String s1=i0.toString();
        System.out.println(s1.getClass().getName());

        Boolean b0=Boolean.valueOf("False");
        boolean b3=b0.booleanValue();
        System.out.println(b3);
        boolean b4=true;
        String s=b0.toString();
        System.out.println(s);
        Integer i_1=new Integer(10);

        String s2=i_1.toString(15,2);
        System.out.println(s2);

        String s3=Long.toString(15l,2);
        System.out.println(s3);

        String s4=Byte.toString(((byte)101));
        System.out.println(s4);


        String s5=Integer.toBinaryString(15);
        String s6=Integer.toOctalString(15);
        String s7=Integer.toHexString(15);
        String s8=Long.toBinaryString(15);
        String s9=Long.toOctalString(15);
        String s10=Long.toHexString(15);
        String s11=Float.toHexString(10.45f);
        String s12=Double.toHexString(145.564);
        System.out.println(s5+"\t"+s6+"\t"+s7+"\t"+s8+"\t"+s9+"\t"+s10+"\t"+s11+"\t"+s12);










    }
}
