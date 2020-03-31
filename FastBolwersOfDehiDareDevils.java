import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FastBolwersOfDehiDareDevils {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Delhi DareDevils.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while (line!=null)
        {
            if(line.contains("(FBW)"))
            {
                line=line.replace("(AR)","");
                line=line.replace("(B)","");
                line=line.replace("(FP)","");
                line=line.replace("(SBW)","");
                System.out.println(line);
            }
            line=br.readLine();

        }
    }
}
