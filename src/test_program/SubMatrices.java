package test_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubMatrices {

    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(System.in);
        int noOfElements=scanner.nextInt();
        int[] elements=new int[noOfElements];
        for(int i=0;i<noOfElements;i++){
            elements[i]=scanner.nextInt();
        }
        int noOfQueries=scanner.nextInt();
        int[] result=new int[noOfQueries];
        for(int i=0;i<noOfQueries;i++){
            int sum=0;
            int startIndex=scanner.nextInt();
            int endIndex=scanner.nextInt();
            Map<Integer,Integer> digitFrequency=new HashMap<>();
            for(int j=startIndex-1;j<endIndex;j++){
                if(digitFrequency.containsKey(elements[j])){
                    digitFrequency.put(elements[j],digitFrequency.get(elements[j])+1);
                }
                else{
                    digitFrequency.put(elements[j],1);
                }
            }
            for(Map.Entry<Integer,Integer> entry:digitFrequency.entrySet()){
                if(entry.getValue()%2!=0){
                    sum=sum+entry.getKey()*entry.getValue();
                }
            }
            result[i]=sum;
        }
        for(int res:result){
            System.out.println(res);
        }
    }
}
