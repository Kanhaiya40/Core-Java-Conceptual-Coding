import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class BufferReaderClass {
    public static void main(String[] args) throws IOException {
        File f=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Example.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        char[] ch=new char[(int)f.length()];
        fr.read(ch);
        int i=fr.read();
        String s=br.readLine();
        while(s!=null)
        {
            System.out.println(s);
            s=br.readLine();
        }
        System.out.println("\n");
        for (char ch1:ch
             ) {
            System.out.println(ch1);
        }
        System.out.println("\n");
        while(i!=-1)
        {
            System.out.println((char)i);
            i=fr.read();
        }
        br.close();

    }
}
