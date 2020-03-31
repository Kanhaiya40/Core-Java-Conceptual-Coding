import java.io.File;

public class NumberOfFilesAndDirectoryInCurrentFile {
    public static void main(String[] args) {
        int count=0;
        File f1=new File("/home/kanhaiya/IdeaProjects/Spring");
        String[] s1=f1.list();
        for (String s2:s1
             ) {
            count++;
            System.out.println(s2);

        }
        System.out.println("Total no of File Prest in Current Directory:\t"+count);
    }
}
