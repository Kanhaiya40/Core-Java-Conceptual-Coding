import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ForeignPlayersOfChennaiSuperKings {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Chennai Super Kings.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while (line!=null)
        {
            if(line.contains("(FP)"))
            {
                line=line.replace("(AR)","");
                line=line.replace("(FBW)","");
                line=line.replace("(SBW)","");
                line=line.replace("(B)","");
                System.out.println(line);
            }
            line=br.readLine();

        }
    }
}
