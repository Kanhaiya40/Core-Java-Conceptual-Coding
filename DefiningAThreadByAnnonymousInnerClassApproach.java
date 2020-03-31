/*class Approach1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Good Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Kanhiaya");
        }
    }
}
*/








public class DefiningAThreadByAnnonymousInnerClassApproach {
    public static void main(String[] args) {
        //Approach1 a1=new Approach1();
      //  a1.start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("Good Morning");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println("Asfaque");
        }
        Thread t1=new Thread()
        {
            @Override
            public void run() {
                for (int i = 0; i <10 ; i++) {
                    System.out.println("Good Morning");
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException e)
                    {
                        System.out.println(e);
                    }
                    System.out.println("Happy");
                }
            }
        };
        t1.start();
    }
}



/*
1. In this Program I have Defined a Thread by Normal approach and By Annonymous Inner Class Approach.
2. So To Find Diffreance Normal Approach have Been Commented.
 */