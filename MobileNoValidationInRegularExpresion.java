import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNoValidationInRegularExpresion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Mobile no.");
        String str=sc.nextLine();
        Pattern p1=Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m1=p1.matcher(str);
            if(m1.find() && m1.group().equals(str))
            {
                System.out.println("Entered Mobile No is valid  ");
            }
            else
            {
                System.out.println("! Incorrect Mobile Number");
        }
    }
}
