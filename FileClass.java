import java.io.*;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File f1=new File("IPL Teams");
        f1.mkdir();
        File f2=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","Chennai Super Kings.txt");
        f2.createNewFile();
        File f3=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","Royal Challenger Banglore.txt");
        f3.createNewFile();
        File f4=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","KingsXI Punjab.txt");
        f4.createNewFile();
        File f5=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","Kolkata KnightRiders.txt");
        f5.createNewFile();
         File f6=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","Mumbai Indians.txt");
        f6.createNewFile();
        File f7=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","Delhi Daredevils.txt");
        f7.createNewFile();
        File f8=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","Rajasthan Royals.txt");
        f8.createNewFile();
        File f9=new File("/home/kanhaiya/IdeaProjects/Spring/IPL Teams","Sunriser Hydrabad.txt");
        f9.createNewFile();
        System.out.println(f1.exists());
        System.out.println(f2.isFile());
        System.out.println(f1.isDirectory());

    }
}
