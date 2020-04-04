import java.util.regex.Pattern;

public class StringClassSplitMethod {
    public static void main(String[] args) {
        String s1="www.Kanhaiya.Software.Solution.com";
        String[] str1= s1.split("[.]");
        for (String str:str1
             ) {
            System.out.println(str);
        }
    }
}
