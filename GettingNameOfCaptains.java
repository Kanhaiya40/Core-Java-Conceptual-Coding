import java.io.*;

public class GettingNameOfCaptains {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Captains.txt",true);
        PrintWriter p1=new PrintWriter(fw);
        FileReader fr=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Chennai Super Kings.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        FileReader fr1=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Delhi DareDevils.txt");
        BufferedReader br1=new BufferedReader(fr1);
        String line1=br1.readLine();
        FileReader fr2=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/KingsXI Punjab.txt");
        BufferedReader br2=new BufferedReader(fr2);
        String line2=br2.readLine();
        FileReader fr3=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Kolkata KnightRiders.txt");
        BufferedReader br3=new BufferedReader(fr3);
        String line3=br3.readLine();
        FileReader fr4=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Mumbai Indians.txt");
        BufferedReader br4=new BufferedReader(fr4);
        String line4=br4.readLine();
        FileReader fr5=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Rajasthan Royals.txt");
        BufferedReader br5=new BufferedReader(fr5);
        String line5=br5.readLine();
        FileReader fr6=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Royal Challenger Banglore.txt");
        BufferedReader br6=new BufferedReader(fr6);
        String line6=br6.readLine();
        FileReader fr7=new FileReader("/home/kanhaiya/IdeaProjects/Spring/IPL Teams/Sunriser Hydrabad.txt");
        BufferedReader br7=new BufferedReader(fr7);
        String line7=br7.readLine();
        while(line!=null && line1!=null && line2!=null && line3!=null && line4!=null && line5!=null && line6!=null && line7!=null)
        {
            if (line.contains("Captain")) {
                line=line.replace("(Captain) (wk)","(Captain)");

                p1.println(line);

            }
            if (  line1.contains("Captain"))
            {
                line1=line1.replace('1','2');
                p1.println(line1);

            }
            if (line2.contains("Captain"))
            {
                line2=line2.replace("1","3");
                p1.println(line2);
            }
            if (line3.contains("Captain"))
            {
                line3=line3.replace('1','4');
                line3=line3.replace("(Captain) (wk)","(Captain)");
                p1.println(line3);
            }
            if (line4.contains("Captain"))
            {
                line4=line4.replace("1","5");
                p1.println(line4);
            }
            if (line5.contains("Captain"))
            {
                line5=line5.replace('1','6');
                p1.println(line5);
            }
            if(line6.contains("Captain"))
            {
                line6=line6.replace('1','7');
                p1.println(line6);
            }
            if(line7.contains("Captain"))
            {
                line7=line7.replace('1','8');
                p1.println(line7);
            }


            line=br.readLine();
            line1=br1.readLine();
            line2=br2.readLine();
            line3=br3.readLine();
            line4=br4.readLine();
            line5=br5.readLine();
            line6=br6.readLine();
            line7=br7.readLine();



        }
        p1.flush();
        p1.close();
        br.close();
        br1.close();
        br2.close();
        br3.close();
        br4.close();
        br5.close();
        br6.close();
        br7.close();
    }
}

