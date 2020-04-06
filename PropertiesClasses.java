import java.io.*;
import java.util.Properties;

public class PropertiesClasses {
    public static void main(String[] args) throws IOException {
        PrintWriter p1=new PrintWriter("Properties.txt");
        p1.println("name=Kanhaiya");
        p1.println("Mobile no=7024860732");
        p1.println("Pincode=851135");
        p1.flush();
        p1.close();
        Properties p2=new Properties();
        FileInputStream fis=new FileInputStream("Properties.txt");
        p2.load(fis);
        String s1=p2.getProperty("name");
        System.out.println(p2.setProperty("name","Hathim"));
        FileOutputStream fos=new FileOutputStream("Properties.txt");
        p2.store(fos,"name Changed");
        System.out.println(s1);
    }
}
