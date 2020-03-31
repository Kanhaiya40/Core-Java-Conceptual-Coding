import java.io.File;

public class NumberOfDirectoryPesentInGivenDirectory {
    public static void main(String[] args) {
        int count=0;
        File f1=new File("/home/kanhaiya/Desktop");
        String[] s1=f1.list();
        for (String s:s1
             ) {
            File f2=new File(f1,s);
            if (f2.isDirectory())
            {
                count++;
                System.out.println(s);
            }

        }
        System.out.println("The Total nuber of Directory present in Given Directory:\t"+count);
    }
}
