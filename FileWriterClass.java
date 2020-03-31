import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Example.txt",true);
        fw.write("This is My Extra file");
        fw.write('\n');
        fw.write('K');
        fw.write('\n');
        fw.write(100);
        fw.write('\n');
        char[] ch={'N','O'};
        fw.write( ch);
        fw.flush();
        fw.close();


    }
}
