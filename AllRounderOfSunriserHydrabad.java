import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AllRounderOfSunriserHydrabad {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Sunriser Hydrabad.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while (line!=null)
        {
            if(line.contains("(AR)"))
            {
                line=line.replace("(SBW)","");
                line=line.replace("(B)","");
                line=line.replace("(FP)","");
                line=line.replace("(FBW)","");
                System.out.println(line);
            }
            line=br.readLine();

        }
    }
}
