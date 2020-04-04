import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeAppMainMethodClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmplyeeAppAL e3=new EmplyeeAppAL();

        FileWriter f1=new FileWriter("EmployeeApp.txt");


        PrintWriter p1=new PrintWriter(f1);
        Scanner sc=new Scanner(System.in);

        System.out.println("Are you a User Or Admin \nPlease Enter:");
        String a1=sc.nextLine();
        p1.println(a1);
        p1.flush();
        Pattern p2=Pattern.compile("([(u|U)][ser]|[(a|A)][dmin])");
        BufferedReader br=new BufferedReader(new FileReader("EmployeeApp.txt"));
        String line=br.readLine();
        while (line!=null)
        {
            Matcher m1=p2.matcher(line);
            if(m1.find())
            {
                System.out.println("Enter Your Username:");
                String username=sc.nextLine();
                Pattern p3=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.]+([a-zA-Z]))+");
                Matcher m2=p3.matcher(username);
                if (m2.find() )
                {
                    System.out.println("Enter Your Password");
                    String password=sc.nextLine();
                    Pattern p4=Pattern.compile("([@a-zA-Z0-9])+");
                    Matcher m3=p4.matcher(password);
                    if(m3.find() && m3.group().equals(password))
                    {
                        String[] s1=username.split("@");
                        System.out.println("Welcome \t"+s1[0]);
                        e3.enteredToCompanyPortal();

                    }

                }
                else
                {
                    System.out.println("You Entered Wrong Id");
                }

            }
            else
            {
                System.out.println("Your are Not Part Of The Company");
            }
            line=br.readLine();
        }












    }
}
