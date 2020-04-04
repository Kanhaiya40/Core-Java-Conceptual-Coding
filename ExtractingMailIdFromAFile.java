import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractingMailIdFromAFile {
    public static void main(String[] args) throws IOException {
        FileWriter f1=new FileWriter("RegularExpresion.txt",true);
        PrintWriter p1=new PrintWriter(f1);
        p1.println("These are The some Defaulters EmailId:\n 1. kanhaiyaSisteccs2015@gmail.com \n 2. rockstarkanhai40@gmail.com \n 3. kanhaiya@gmail.oulook 4. Assfaque@gmail.in ");
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.]+([a-zA-Z]))+");
        BufferedReader br=new BufferedReader(new FileReader("RegularExpresion.txt"));
        String line=br.readLine();
        System.out.println("The Following Mail Id That Are Matched From File Are:");
        while(line!=null)
        {
            System.out.println(line);
            Matcher m1=p.matcher(line);
            while(m1.find())
            {

                System.out.println(m1.group());
            }
            line=br.readLine();

        }
        p1.flush();
        p1.close();
        br.close();
    }
}
