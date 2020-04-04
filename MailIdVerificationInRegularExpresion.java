import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIdVerificationInRegularExpresion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Email Id:");
        String str=sc.nextLine();
        Pattern p1=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m1=p1.matcher(str);
        if(m1.find() && m1.group().equals(str))
        {
            System.out.println("Valid MailId!");
        }
        else
        {
            System.out.println("Invalid MaiId !");
        }
    }
}
