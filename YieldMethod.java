class Yield1 extends Thread
{
    String name;
    Yield1(String name)
    {
        this.name=name;
    }
    @Override
    public void run() {
        int i=0;
        while (i<10)
        {
            Thread.yield();
            System.out.println("]"+i+"] \t Good Morning");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("I got Interruption");
            }
            System.out.println(name);
            i++;

        }

    }
}
class  Yield2 extends Thread
{
    String yname;
    Yield2(String yname)
    {
        this.yname=yname;
    }
    @Override
    public void run() {
        for (int i = 14; i <24 ; i++) {
            System.out.println("]"+i+"] \tGood Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("I got Intteruption");
            }
            System.out.println(yname);
        }
    }
}




public class YieldMethod {
    public static void main(String[] args) {
        Yield1 y1=new Yield1("Kanhiaya");
        Yield2 y2=new Yield2("Java Code");
        y2.start();
        y2.setPriority(7);
        y1.start();


        for (int i = 24; i <34 ; i++) {
                try
                {
                    Thread.sleep(2000);
                }
                catch(InterruptedException e)
                {
                    System.out.println("This Interruption is to main Method ");
                }

            System.out.println("["+i+"] \tMian Method Execution");
        }
    }
}
