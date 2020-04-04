import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String:");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
       /* int count=1;
        int i=0;
        int j=i+1;
        for (i = 0; i <ch.length-1; j++) {

            if(ch[i]==ch[j])
            {
                i++;

            }

             if (ch[i]!=ch[j])
            {
                continue;
            }

             count++;

        }
        System.out.println(ch[i]);



            */



      for (int i = 0; i < ch.length; i++) {
            for (int j = 1; j < ch.length; j++) {
                if(ch[i]==ch[j])
                {
                    i++;
                   j=i+1;
                }
                 else if (ch[i] != ch[j]) {
                   continue;
                }
            }
            System.out.println("First Non Repeating in Given String"+ch[i]);
            break;
        }

    }
}




