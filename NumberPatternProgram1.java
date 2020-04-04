import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class NumberPatternProgram1 {
    public static void main(String[] args) {
        System.out.println("First Program Output");
       Program1 p1=new Program1();
       p1.m1();
        System.out.println("Second Program Output");
        Program2 p2=new Program2();
        p2.m1();
        System.out.println("Third Program Output");
        Program3 p3=new Program3();
        p3.m1();
        System.out.println("Fourth Program Output");
        Program4 p4=new Program4();
        p4.m1();
        System.out.println("Fifth Program Output");
        Program5 p5=new Program5();
        p5.m1();
        System.out.println("Sixth Program Output");
        Program6 p6=new Program6();
        p6.m1();
        System.out.println("Seventh Program Output");
        Program7 p7=new Program7();
        p7.m1();
        System.out.println("Eighth Program Output");
        Program8 p8=new Program8();
        p8.m1();
        System.out.println("Ninth Program Output");
        Program9 p9=new Program9();
        p9.m1();
        System.out.println("10th Program Output");
        Program10 p10=new Program10();
        p10.m1();
        System.out.println("11th Program Output");
        Program11 p11=new Program11();
        p11.m1();
        System.out.println("12th Program Output");
        Program12 p12=new Program12();
        p12.m1();
        System.out.println("13th Program Output");
        Program13 p13=new Program13();
        p13.m1();
        System.out.println("14th Program Output");
        Program14 p14=new Program14();
        p14.m1();
        System.out.println("15th Program Output");
        Program15 p15=new Program15();
        p15.m1();
        System.out.println("16th Program Output");
        Program16 p16=new Program16();
        p16.m1();
        System.out.println("17th Program Output");
        Program17 p17=new Program17();
        p17.m1();
        System.out.println("18th Program Output");
        Program18 p18=new Program18();
        p18.m1();
        System.out.println("19th Program Output");
        Program19 p19=new Program19();
        p19.m1();



    }
}
class Program1
{
    public void m1() {
        for (int i = 2; i < 9; i++) {
            {
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
                System.out.println(" ");
            }

        }
    }

}
class Program2
{
    public  void m1()
    {
        for (int i = 2; i < 9; i++) {
            if(i==7)
            {
                continue;
            }
                for (int j = 1; j < i; j++) {



                        System.out.print(j);
                }
                System.out.println(" ");
            }

        for (int i = 7; i >0 ; i--) {

            for (int j = 1; j <i ; j++) {
                System.out.print(j);
            }
            System.out.println(" ");

        }

    }
}
class Program3
{
    public void m1()
    {
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(i);
            }
            System.out.println(" ");

        }
    }
}

class Program4
{
    public void m1()
    {
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j >i; j--) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}
class Program5
{
    public void m1()
    {
        for (int i = 8; i >0 ; i--) {

            for (int j = 1; j <i ; j++) {
                System.out.print(j);

            }
            System.out.println(" ");

        }
    }
}
class Program6
{
    public void m1()
    {
        for (int i = 7; i >0 ; i--) {
            for (int j = i; j >0; j--) {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}
class Program7
{
    public void m1()
    {
        for (int i = 6; i >=0; i--) {
            for (int j = 7; j >i; j--) {
                System.out.print(j);

            }
            System.out.println(" ");

        }
    }
}
class Program8
{
    public void m1()
    {
        for (int i = 1; i <8; i++) {
            for (int j = 1; j <= i;j++) {
                System.out.print(" ");
                    System.out.print(j);

                }
            for (int j = i-1; j >=1; j--) {

                System.out.print(" ");

                    System.out.print(j);

            }





            System.out.println(" ");
            }

        }
    }
class Program9
{
    public void m1()
    {
        for (int i = 1; i <7 ; i++) {
            for (int j = i; j <=i; j--) {
                System.out.print(" ");
                if(j==0)
                {
                    break;
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println(" ");
        }
    }
}
class Program10
{
    public void m1()
    {
        for (int i = 7; i >0 ; i--) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(" ");
                System.out.print(j);

            }
            System.out.println(" ");
        }
        for (int i = 1; i <8 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
class Program11
{
    public void m1()
    {
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("  ");

            }
            for (int j = i+1; j <8; j++) {
                System.out.print(" ");
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for (int i = 7; i >0; i--) {

            for (int j = 1; j <=i-1 ; j++) {
                System.out.print("  ");
            }

            for (int j = i; j <=7; j++) {
                System.out.print(" ");
                System.out.print(j);

            }
            System.out.println("");
        }
    }
}
class Program12
{
    public void m1()
    {
        System.out.println("\n");
        for (int i = 2; i < 9; i++) {
            for (int j = 1; j <i; j++) {
                if(j%2!=0)
                System.out.print("1");
                if(j%2==0)
                    System.out.print("0");

            }
            System.out.println(" ");
        }
    }
}
class Program13
{

    public void m1()
    {
        System.out.println("\n");
        for (int i = 0; i <7; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }

            for (int j = i+1; j <8; j++) {
                System.out.print(" ");
                System.out.print(j);

            }
            System.out.println(" ");

        }
        for (int i = 6; i >0 ; i--) {
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=7 ; j++) {
                System.out.print(" ");
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}
class Program14
{
    public void m1()
    {
        System.out.println("\n");
        int count=0;
        for (int i = 1; i <8 ; i++) {
            for (int j = 7; j >i; j--) {
                System.out.print(" ");
                    System.out.print(1);
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
class Program15
{
    public void m1()
    {
        for (int i = 0; i <7 ; i++) {
            if(i%2==0) {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 != 0)
                        System.out.print(" "+0);
                    else
                        System.out.print(" "+1);
                }
            }
            else
            {
                for (int j = 0; j < 7; j++) {
                    if (j % 2 == 0)
                        System.out.print(" "+0);
                    else
                        System.out.print(" "+1);

                }
            }
            System.out.println(" ");

        }

    }
}
class Program16
{
    public void m1()
    {
        for (int i = 1; i <=5; i++) {
           int  num=i;
            for (int j = 1; j <=i; j++) {
                System.out.print(num+" ");
                num=num+5-j;
            }

            System.out.println(" ");
        }
    }
}
class Program17
{
    public void m1()
    {
        for (int i = 1; i < 8; i++) {
            for (int j = i; j < 8; j++) {
                System.out.print(" ");
                System.out.print(j);
            }

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
                System.out.print(j);
            }


            System.out.println(" ");
        }
    }
}
class Program18
{
    public void m1()
    {
        int num=1;
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(num+" ");
                num=num+1;

            }
            System.out.println(" ");
        }
    }
}
class Program19
{
    public void m1()
    {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}