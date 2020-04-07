import java.util.Arrays;
import java.util.Scanner;

public class ToFindNoOfCandice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long numberOfCandice=0;
        System.out.println("Enter The no. Of Student:");
        int n=sc.nextInt();
        int[] x=new int[n];
        System.out.println("Student Names With Performances:");
        for (int i = 0; i < x.length; i++) {
            System.out.print("Student["+i+"]\t");
            x[i]=sc.nextInt();
        }
        int[] c=new int[x.length];
        Arrays.fill(c,1);

        for (int i = 1; i <x.length; i++) {
            if (x[i]>x[i-1])
            {
                c[i]=c[i-1]+1;
            }
        }
        for (int i = n-2; i >=0; i--) {
            if (x[i]>x[i+1])
            {
                c[i]=Math.max((c[i+1]+1),c[i]);
            }

        }
        for (int c1:c
             ) {
            numberOfCandice=numberOfCandice+(long) c1;
        }
        System.out.println("Minimum Number Of Candice Should Kinder Teacher Bring to School is:"+numberOfCandice);



    }
}
