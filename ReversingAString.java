import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String That is to be Reverse");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        char[] c=new char[ch.length];
        StringBuffer sb=new StringBuffer();

        for (int i = ch.length-1, j=0; i >=0 && j<c.length ; i--,j++) {

            c[j]=ch[i];
            sb.append(ch[i]);

            }
        System.out.println("String Reversed According to char Array Data Structure:");
        for (char c1:c
             ) {
            System.out.print(c1);

        }
        System.out.println("\n");
        System.out.println("String Reversed With help of StringBuffer:");
        System.out.println(sb);
        System.out.println("String Re-Reversed directly with the reverse funtion:");
        StringBuffer s1=sb.reverse();
        System.out.println(s1);


        }

    }
