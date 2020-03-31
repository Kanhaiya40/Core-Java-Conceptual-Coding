import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SpinBowlersOfChennaiSuperKings {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Chennai Super Kings.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while (line!=null)
        {
            if(line.contains("(SBW)"))
            {
                line=line.replace("(AR)","");
                line=line.replace("(FP)","");
                System.out.println(line);
            }
            line=br.readLine();

        }
    }
}
