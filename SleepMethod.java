class Sleep1 extends Thread
{
    Sleep2 s;
    String name;
    Sleep1(String name,Sleep2 s)
    {
        this.name=name;
        this.s=s;
    }
    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {
            System.out.println("Good Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(name);
            System.out.println("is Playing:");
            try {
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

            s.Playing();
        }
    }
}
class Sleep2
{
    String game;
    Sleep2(String game)
    {
        this.game=game;
    }

    public void Playing()
    {
        System.out.println(game);

    }
}





public class SleepMethod {
    public static void main(String[] args) {
        Sleep2 s2=new Sleep2("Football");
        Sleep1 s1=new Sleep1("Kanhaiya",s2);
        s1.start();
    }
}
