import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpresion {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("a");
        Matcher m1=p1.matcher("Kanhaiya");
        while (m1.find())
        {
            System.out.println(m1.start()+"\t"+m1.group()+"\t"+m1.end());
        }
    }
}
