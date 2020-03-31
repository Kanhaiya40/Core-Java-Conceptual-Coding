import java.util.Scanner;

public class PrintDuplicatesFromGivenString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean b;
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        StringBuffer sb1=new StringBuffer();
        char[] ch=str.toCharArray();
        for (char value:ch
             ) {
            b=false;
            for (int i = 0; i <sb.length() ; i++) {

                if(value==sb.charAt(i))
                {
                    b=true;
                    sb1.append(value);
                    break;
                }

            }
           if(!b)
            {
               sb.append(value);
            }
        }
        System.out.println(sb1);

    }
}
