import java.util.Scanner;

public class RemovingSecondStringFromFirstString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str1=sc.nextLine();
        System.out.println("Enter Second String:");
        String str2=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        boolean b;
        for (int i = 0; i <str1.length() ; i++) {
            b=false;
            for (int j = 0; j <str2.length() ; j++) {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    b=true;
                    break;
                }
            }
            if(!b)
            {
                sb.append(str1.charAt(i));
            }

        }
        System.out.println(" First String After Removing all Character of Second String from ItSelf: ");
        System.out.println(sb);
    }
}
