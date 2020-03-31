interface Adapter
{
    public void m1();
    public void m2();
    public void m3();
    public void m4();
    public void m5();
    public void m6();
    public void m7();
    public void m8();
    public void m9();
    public void m10();

} /* Inside Interface we can't Declare static or Instance BLock*/
abstract class Adapter1Class implements Adapter{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m4() {

    }

    @Override
    public void m5() {
        System.out.println("This is Method five");
    }

    @Override
    public void m6() {

    }

    @Override
    public void m7() {

    }

    @Override
    public void m8() {

    }

    @Override
    public void m9() {

    }

    @Override
    public void m10() {

    }
}



class Adapter2 extends Adapter1Class
{
    static
    {
        System.out.println("This is Satic Block");
    }

    @Override
    public void m9() {
        System.out.println("This is method nine");
    }

    @Override
    public void m1() {
        System.out.println("This is method One");
    }

    @Override
    public void m3() {
        System.out.println(

      "This is our Tihrd class"  );
    }
}
class Adapter3 extends  Adapter1Class
{
    @Override
    public void m4() {
        System.out.println("This our Fourth Method");
    }

    @Override
    public void m5() {
        super.m5();
    }
}

    public class AdapterClasses {
        public static void main(String[] args) {

        Adapter2 a1=new Adapter2();
        a1.m1();
        a1.m1();
        a1.m9();
        Adapter3 a2=new Adapter3();
        a2.m4();
        a2.m5();
        }
    }
