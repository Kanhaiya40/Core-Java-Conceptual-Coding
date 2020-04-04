import java.util.regex.Pattern;

public class PatternClassSPlitMethod {
    public static void main(String[] args) {
        Pattern p1=Pattern.compile("\\.");
        String[] s=p1.split("www.Kanhaiya.Software.Solution.Com");
        for (String str:s
             ) {
            System.out.println(str);
        }

    }
}
