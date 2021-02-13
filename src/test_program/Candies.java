package test_program;

import java.util.Scanner;

public class Candies {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int count=0;
        int temp;
        for (int i = 1; i <= 45; i=i+2) {
            int sum=0;
            temp=i;
            while(temp!=N+2){
               sum=sum+temp;
               if (sum==N){
                   count++;
                   if (i!=N) {
                       i = temp - 2;
                   }
                   else {
                       i=temp;
                   }
                   break;
               }
               else if (sum>N){
                   break;
               }
               temp=temp+2;
            }
        }
        System.out.println(count);
    }
}
