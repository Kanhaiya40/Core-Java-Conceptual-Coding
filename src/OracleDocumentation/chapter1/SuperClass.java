package OracleDocumentation.chapter1;

public class SuperClass  extends Object{
        protected String name;
        protected int roll;
        SuperClass()
        {
                name="Kahaiya";
                roll=40;
        }

}

/**
 * In the Sub class we need not to declare the variable that are already
 * Declared in SuperClass
 * But Variables in Super Class must be protected
 */
class SubClass extends SuperClass
{
     protected   int rank;

     SubClass(String name, int roll, int rank)
     {
             this.name=name;
             this.roll=roll;
             this.rank=rank;

     }
}
