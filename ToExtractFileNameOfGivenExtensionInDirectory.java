import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ToExtractFileNameOfGivenExtensionInDirectory {
    public static void main(String[] args) {
        File f=new File("/home/kanhaiya/IdeaProjects/Spring/src");

        String[] s=f.list();

        int count=1;
        Pattern p1=Pattern.compile("[a-zA-Z0-9_.$]+[.]java");

        assert s != null;
        for (String s1:s
             ) {

            Matcher m1=p1.matcher(s1);
            if (m1.find() && m1.group().equals(s1)) {
                System.out.println(count+"\t"+s1);
            }
            count++;
        }
    }
}
