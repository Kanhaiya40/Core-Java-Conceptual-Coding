import java.util.Scanner;

public class ReverseWordInGivenSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        String[] sb=new String[s1.length];
        for (int i = s1.length-1, j=0;i >=0 && j<s1.length; i--,j++) {

            sb[j]=s1[i];

        }

        System.out.println("Reverse Word Of String");

        for (String s3:sb)
        {
            System.out.print(s3+" ");
        }

    }
}
