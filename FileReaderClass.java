import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Example.txt");
        int i=fr.read();
        while(i!=-1)
        {
            System.out.print((char)i);
            i=fr.read();
        }
        System.out.println("\n");
        File f=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Example.txt");
        FileReader fr1=new FileReader(f);
        char[] ch=new char[(int)f.length()];
        fr1.read(ch);
        for (char ch1:ch
             ) {
            System.out.print(ch);
        }
    }



}
