import java.util.Scanner;

class Join1 extends Thread{
   static Thread j2;
    @Override
    public void run() {
        try {


            j2.join(1000) ;


        }
        catch (InterruptedException e)
        {
            System.out.println("It got intrrupted");
        }

        for (int i = 0; i <10 ; i++) {

            System.out.println("Heloo");

            try
            {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("I got Interruption");
            }
            System.out.println("Kanhiaya");
        }
    }
}
class Join2 extends Thread
{
    Join1 j1;
    @Override
    public void run() {

        for (int i = 0; i <10 ; i++) {

            System.out.println("Good Morning");

            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("I got Interruption");
            }
            System.out.println("Mom");

        }
    }
}





    public class JoinMethod {
        public static void main(String[] args)  throws InterruptedException {
            Scanner sc = new Scanner(System.in);
            Join1 j1 = new Join1();
            Join2 j2=new Join2();
            j2.start();

             j1.start();



            System.out.println("The Disnt no of given array are:");

            int a[]={2,3,4,5,6,7,8,2,4,9,3};

            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < i; j++) {
                    if(a[i]==a[j])
                        break;
                    else if(i==j)
                        System.out.println(a[i]);


                }


            }


            }
        }


