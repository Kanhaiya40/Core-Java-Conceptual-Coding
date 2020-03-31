
import java.util.Scanner;


public class RemoveDuplicateCharacterofGivenString {
    public static void main(String[] args) {
        System.out.println("Enter Your String");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        StringBuffer sh=new StringBuffer();
        for (char c : ch) {
            boolean avialable = false;
            for (int j = 0; j < sh.length(); j++) {
                if (c == sh.charAt(j)) {
                    avialable = true;
                    break;
                }
            }

            if (!avialable) {
                sh.append(c);
            }
        }
        System.out.println(" String After Removal Of Duplicates  Character From  Given String:");
        System.out.println(sh);
    }
}

