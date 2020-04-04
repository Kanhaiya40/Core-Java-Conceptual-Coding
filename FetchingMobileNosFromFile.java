import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FetchingMobileNosFromFile {
    public static void main(String[] args) throws IOException {
        PrintWriter p1=new PrintWriter("RegularExpresion.txt");
        p1.println("This is My mobile No.:07024860732");
        p1.println("This Is Assfaques homeLandLine no:6743269075 ");
        p1.println("This is Happay,s Contact No:916587457689");
        p1.flush();
        p1.close();
        Pattern p2=Pattern.compile("(0|91)?[6-9][0-9]{9}");
        BufferedReader br=new BufferedReader(new FileReader("RegularExpresion.txt"));
        String str1=br.readLine();
        while (str1!=null) {
            Matcher m1 = p2.matcher(str1);
            while (m1.find())
            {
                System.out.println(m1.group());
            }
            str1=br.readLine();
        }
        br.close();




    }
}
