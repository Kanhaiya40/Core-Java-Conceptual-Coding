public class AutoBoxingAndAutoUnboxing {
    public static void main(String[] args) {
        //Autoboxing internally implements valueOf()

        Integer i=10;
        Character c='k';
        Byte b=127;
        Short s=23453;
        Float f=15.145f;
        Long l=64564654l;
        Double d=1254.2546;

        //Buffring Concept is applicable in AutoBoxing

        Integer i7=1000;
        Integer i3=1000;

        System.out.println(i7==i3);

        Integer i4=100;
        Integer i5=100;

        System.out.println(i4==i5);

        Integer i6=10;
        Integer i8=10;

        System.out.println(i6==i8);

        Byte b2=126;
        Byte b3=126;

        System.out.println(b2==b3);

        //As we All Know AutoBoxing is implemented by valueOf() so Buffring Concept is also aplicable for created wrapper Object by valueOf Methods

        Integer i9=10;

        Integer i10=Integer.valueOf(10);

        System.out.println(i9==i10);

        Integer i11=1000;

        Integer i12=Integer.valueOf(1000);

        System.out.println(i11==i12);





        System.out.println(i+"\t"+c+"\t"+b+"\t"+s+"\t"+f+"\t"+l+"\t"+d);


        //AutoUnboxing internally implements xxxValue()

        Integer i1=new Integer("100");

        int i2=i1;
        char c1=c;
        byte b1=b;
        short s1=s;
        float f1=f;
        long l1=l;
        Double d1=d;



        System.out.println(i2+"\t"+c1+"\t"+b1+"\t"+s1+"\t"+f1+"\t"+l1+"\t"+d1);

    }
}
