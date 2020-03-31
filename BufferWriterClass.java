import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter f1=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Example.txt",true);
        BufferedWriter bw=new BufferedWriter(f1);
        bw.newLine();
        bw.write("This Line is Written By BufferWritter Object");
        bw.newLine();
        bw.write("Is it All Ok");
        bw.flush();
        bw.close();

    }
}
