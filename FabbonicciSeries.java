import java.util.Scanner;
import java.util.TreeMap;

public class FabbonicciSeries {
    public int  sum(char[] c,TreeMap t)
    {
        int sum=0;
        for (int i = 0; i <c.length ; i++) {
            if (t.containsKey(c[i]))
            {
                sum=sum+(Integer) t.get(c[i]);
            }
        }

        return sum;

    }
    public static void main(String[] args) {
        FabbonicciSeries f1=new FabbonicciSeries();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String:");
        String s=sc.nextLine().toUpperCase();
        char[] ch=s.toCharArray();
        int t1=0;
        int t2=1;
        int temp;
        char c,d;
        TreeMap t9=new TreeMap();

        for (int i = 0; i < 26; i++) {
            c=(char)(65+i);
            d=(char)(97+i);
            //System.out.println(st[i]);
            t9.put(c,t1);
            t9.put(d,t1);

           // System.out.println(c+"="+t1);
            temp = t1 + t2;
            t2 = t1;
            t1 = temp;

        }
        System.out.println(t9);
        System.out.println("Sum of Given String is:");


        System.out.println(f1.sum(ch,t9));


    }
}
