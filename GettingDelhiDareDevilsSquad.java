import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GettingDelhiDareDevilsSquad {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Delhi DareDevils.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null)
        {
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
}
