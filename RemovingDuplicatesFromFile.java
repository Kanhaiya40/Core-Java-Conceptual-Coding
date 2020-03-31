import java.io.*;

public class RemovingDuplicatesFromFile {
    public static void main(String[] args) throws IOException {
        PrintWriter pw=new PrintWriter("Extra.txt");
        pw.println(222);
        pw.println(333);
        pw.println(444);
        pw.println(555);
        pw.println(666);
        pw.println(777);
        pw.println(333);
        pw.println(555);
        pw.println(666);
        pw.flush();
        pw.close();
        boolean available=false;
        FileWriter fw=new FileWriter("Output.txt");
        PrintWriter p1=new PrintWriter(fw);
        FileReader f=new FileReader("Extra.txt");
        BufferedReader bf=new BufferedReader(f);

        String line=bf.readLine();
        while (line!=null)
        {
            BufferedReader br=new BufferedReader(new FileReader("Output.txt"));
            String target=br.readLine();
            while(target!=null)
            {
                if(line.equals(target))
                {
                    available=true;
                    break;
                }
                target=br.readLine();
            }
            if(available==false)
            {
                p1.println(line);
                p1.flush();

            }
            br.close();
            line=bf.readLine();
        }

        p1.close();
        bf.close();

    }
}
