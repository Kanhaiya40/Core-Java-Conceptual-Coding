import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedClassesInRegularExpresion {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("\\d");
        Pattern p6=Pattern.compile("\\D");
        Pattern p5=Pattern.compile("\\s");
        Pattern p2=Pattern.compile("\\S");
        Pattern p3=Pattern.compile("\\w");
        Pattern p4=Pattern.compile("\\W");
        Matcher m1=p1.matcher("97543   @#$ AskjsAER");
        while (m1.find())
        {
            System.out.println(m1.start()+"\t"+m1.group()+"\t"+m1.end());
        }
        System.out.println("******");
        Matcher m2=p2.matcher("97543   @#$ AskjsAER");
        while (m2.find())
        {
            System.out.println(m2.start()+"\t"+m2.group()+"\t"+m2.end());
        }
        System.out.println("******");
        Matcher m3=p3.matcher("97543   @#$ AskjsAER");
        while (m3.find())
        {
            System.out.println(m3.start()+"\t"+m3.group()+"\t"+m3.end());
        }
        System.out.println("*****");
        Matcher m4=p4.matcher("97543   @#$ AskjsAER");

        while (m4.find())
        {
            System.out.println(m4.start()+"\t"+m4.group()+"\t"+m4.end());
        }
        System.out.println("*****");
        Matcher m5=p5.matcher("97543   @#$ AskjsAER");
        while (m5.find())
        {
            System.out.println(m5.start()+"\t"+m5.group()+"\t"+m5.end());
        }
        System.out.println("*****");
        Matcher m6=p6.matcher("97543   @#$ AskjsAER");
        while (m6.find())
        {
            System.out.println(m6.start()+"\t"+m6.group()+"\t"+m6.end());
        }

    }
}
