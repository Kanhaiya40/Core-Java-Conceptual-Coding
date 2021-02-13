package test_program;

import java.util.Scanner;

public class MoneyMind {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int[] profit=new int[N];
        for (int i = 0; i < profit.length; i++) {
           profit[i]=scanner.nextInt();
        }
        int i=0;
        int sum=0;
        while (i!=M){
            int max=0;
            for (int j = 0; j < profit.length; j++) {
                if (profit[j]>max){
                    max=profit[j];
                    profit[j]='\0';
                }
            }
            sum=sum+max;
            i++;
        }
        System.out.println(sum);
    }
}
