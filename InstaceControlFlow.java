

public class InstaceControlFlow {

    InstaceControlFlow()
    {
        System.out.println("This is Instance Constructor");

    }

    int i=10;

    {
        System.out.println("This is First Instance block");
        System.out.println(i);

        m1();
    }
    static
    {
        m2();
    }

    {

        m2();
        System.out.println("This is Second Instance Block");

    }
    public static void m2()
    {
        System.out.println("This is method 2");

    }
    int k=18;
    public void m1()
    {
        System.out.println(k);
        System.out.println("This is Method m1");
        System.out.println(y);
    }
    int y=7;

    public static void main(String[] args) {
        InstaceControlFlow i1=new InstaceControlFlow();

    }
}
/*
1. If there is static member then Execution of Satic member will be done
2. Identification of Instance Member will be done.
3. Execution of Instance Meber will be done.
4. If There is constructor then execution of
 */