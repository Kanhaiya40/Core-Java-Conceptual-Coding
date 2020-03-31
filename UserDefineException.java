import java.util.Scanner;

class GoodBoy extends RuntimeException
{
    GoodBoy(String s)
    {
        super(s);
    }
}
class BadBoy extends RuntimeException
{
    BadBoy(String s)
    {
        super(s);
    }
}





public class UserDefineException {
    public static void main(String[] args)  {
        int percentage=Integer.parseInt(args[0]);
      // Scanner sc=new Scanner(System.in);
      //int   percentage=sc.nextInt();
        if(percentage>100)
        {
            throw new GoodBoy("He too Smart so this type of student not requred");
        }
        else
            if (percentage<40)
            {
                throw new BadBoy("He is not Eligible to sit in class So He is Bad Boy");
            }
            else
            {
                System.out.println("He is not the student of class");
            }
    }
}
