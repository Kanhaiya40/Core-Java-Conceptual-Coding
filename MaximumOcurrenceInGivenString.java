import java.util.*;

public class MaximumOcurrenceInGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String:");
        String s = sc.nextLine().replace(" ","");
        char[] c = s.toCharArray();
        int count =0;
        char ch=' ';
        int max=count;

        for (int i = 0; i <c.length ; i++) {
            count=0;
             ch=s.charAt(i);
            for (int j = 1; j <c.length ; j++) {
                if(ch==c[j])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;

            }

        }
        System.out.println("Maximum Occurrence of Character in given String:");
        if (count==max)
        {
            System.out.println(ch+"\t"+count);
        }




        }


    }

