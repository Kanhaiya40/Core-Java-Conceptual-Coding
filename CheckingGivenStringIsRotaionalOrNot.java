import java.util.Scanner;

public class CheckingGivenStringIsRotaionalOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String concat=str1+str1;
        if(str1.length()!=str2.length())
        {
            System.out.println(str1.length()+"The Given String can't be Rotational"+str2.length());

        }
           else if(concat.indexOf(str2)!=-1)
            {
                System.out.println("Both String are rotation to each other");
            }
           else
        {
            System.out.println("Both String are not rotational to each other");
        }
    }
}

//XYZ
//ZXY str[0]=str[len-1],str[1]=str[0],str[len-1]=str[len-2]
//YZX
//XYZ
