class StaticParentClass
{
    static  int h=19;
    static
    {
        m1();
        System.out.println("This is First static block");
        System.out.println(h);
    }
    public static void  m1()
    {
        System.out.println(k);
    }
    static  int k=8;
    static {
        m2();
        System.out.println("Thgis is Second Static Block");
        System.out.println(k);
    }
    public static void m2()
    {
        System.out.println("This is m2()");
        System.out.println(j);
    }
    static  int j=9;

    public static void main(String[] args) {
        System.out.println("This is main Metthod");
    }
}
class StaticChildClass extends StaticParentClass
{
    static int y=19;
    static
    {
        m1();
        System.out.println("This is First static block of Chil class");
        System.out.println(h);
    }
    static
    {
        m3();
        System.out.println("This is Second static Block of Child Class");
        System.out.println(y);
    }
    public static void m3()
    {
        System.out.println(p);
    }
    static int p=156;

    public static void main(String[] args) {
        m2();
        System.out.println("This is main method os Child CLass");
    }
}





public class StaticControlFlowParentToChildClass {
    public static void main(String[] args) {
       StaticParentClass sc1=new StaticChildClass();
    }
}
/*
1. Identification Of Static member from Parent to Child Class.
2. Execution of static variable assignments and static block from parent to child.
3. Execution of only child class mai method.
 */