import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UseOfCharaterClassesInRegularExpresion {
    public static void main(String[] args) {
        int count=1;
        Pattern p1=Pattern.compile("[A-Z]");
        Matcher m1=p1.matcher("abchhgahba26JCkfkjffncvwlkwlkkjncmn,knkkjKLJDJOJFKFLKLJISiojjj94864hjgdajbhabagbsvcdanabczvxffscscxzghababacabacbacabvfsvcdacbavfacvsc");
        while(m1.find())
        {


            System.out.println((count++)+"\t"+m1.start()+"\t"+m1.group()+"\t"+m1.end());
        }
    }
}
