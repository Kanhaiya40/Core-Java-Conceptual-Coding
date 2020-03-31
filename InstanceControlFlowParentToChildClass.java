class InstanceParentClass
{
    InstanceParentClass()
    {
        System.out.println("This is ParentClass Constructor ");
    }
    int  i=9;
    {
        System.out.println("This is First Instance Block");
        m1();

    }
    public void m1()
    {
        System.out.println("This is method 1");
        System.out.println(k);
    }
    int k=9;
    {
        System.out.println("This is Second Instance Block");
        m2();
    }
    public void m2()
    {
        System.out.println("This is Method2");
        System.out.println(i);
    }



}
class InstanceChildClass extends InstanceParentClass
{
    {
        m2();
        System.out.println("This is Child Instance Block");
    }
    InstanceChildClass()
    {
        System.out.println("This is Child Constructor");
        System.out.println(i);
    }

}




public class InstanceControlFlowParentToChildClass {
    public static void main(String[] args) {
        InstanceChildClass c1=new InstanceChildClass();
    }
}
/*
1. Identification of Instance Block and variables Parent to Chid  Class.
2. Excution of Instance Block and variables of Parent Class.
3. Execution of Parent Class Constructor.
4. Execution of Instance  bLock and variables of Child Class .
5. Execution of Child Class Constructor
 */