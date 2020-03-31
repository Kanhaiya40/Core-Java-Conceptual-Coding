public class StaticControlFlow {
    StaticControlFlow()
    {
        System.out.println("This is Constructor");
    }
    private static int j=10;
    static {
        System.out.println("This is First static block");
        m1();
        System.out.println(j);


    }

    public static void m1()
    {
         int  k=13;
        System.out.println(u);
         m2();


    }

    public static void m2()
    {
        System.out.println("This is Second Static Block");
    }
    static int u=19;

    public static void main(String[] args) {
        StaticControlFlow sc=new StaticControlFlow();
        System.out.println("This is main Method");
    }
}

/*
1. Identification so static member from top to bootom in a class
2. Execution of static variable and static blocks from top to bottm.
3. Execution of main method is done.
 */
