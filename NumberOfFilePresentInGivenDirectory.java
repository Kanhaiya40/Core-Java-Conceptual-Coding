import java.io.File;

public class NumberOfFilePresentInGivenDirectory {
    public static void main(String[] args) {
        int count=0;
        File f=new File("/home/kanhaiya/IdeaProjects/Spring/out/production/Java");
        File f2=new File("/home/kanhaiya/Desktop");
        String[] s1=f.list();
        for (String s:s1
             ) {
            File f1=new File(f,s);
            if (f1.isFile())
            {
                count++;
                System.out.println(s);
            }

        }
        System.out.println("The Total Number of File Present in Given Directory:"+count);
    }
}
