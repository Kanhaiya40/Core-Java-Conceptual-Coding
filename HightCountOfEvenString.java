import java.util.Scanner;
public class HightCountOfEvenString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your String");
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        int max=s1[0].length();

        for (int i = 0; i <s1.length ; i++) {

            if(s1[i].length()%2==0&&s1[i].length()>max)
            {
                max=s1[i].length();
            }
        }
        System.out.println("String Which is having Highest length of even:");
        for (int i = 0; i <s1.length ; i++) {
            if (max==s1[i].length())
            {
                System.out.println(s1[i]);
            }
        }
        System.out.println("Which is Length of:"+max);


    }
}
