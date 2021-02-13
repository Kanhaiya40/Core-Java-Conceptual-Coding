package hacker_earth_problems;

import java.util.Arrays;
import java.util.Scanner;

public class BitWiseOR {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int length=scanner.nextInt();
        int[] arr=new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]=scanner.nextInt();
        }
        int noOfQueries=scanner.nextInt();
        for (int i = 0; i < noOfQueries; i++) {
            int L=scanner.nextInt();
            int R=scanner.nextInt();
            int M=scanner.nextInt();
            int lengthOfSubArray=R+1-L;
            int[] subArray=new int[lengthOfSubArray];
            int index=L-1;
            for (int j = 0; j < lengthOfSubArray; j++) {
                subArray[j]=arr[index];
                index++;
            }
            int sum=0;
            for (int j = 0; j < lengthOfSubArray; j++) {
                int q=0;
                int[] sb_arr=new int[M];
               while (q!=M){
                   sb_arr[q]=subArray[j];
                   q++;
                   j++;
               }
               j--;
               int bitwise=0;
                for (int bit:sb_arr) {
                    bitwise=bitwise|bit;
                }
                sum=sum+bitwise;
            }
        }
    }
}
