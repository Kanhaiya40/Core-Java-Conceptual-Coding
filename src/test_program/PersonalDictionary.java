package test_program;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PersonalDictionary {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int noOfNames=scanner.nextInt();
        System.out.println();
        String[] names=new String[noOfNames];
        for (int i = 0; i <names.length ; i++) {
            names[i]=scanner.nextLine();
        }
        int k=99;
        int w=97;
        Map<Character,Integer> dic=new HashMap<>();
        for (int i = 1; i <=26; i++) {
            if(i%2==0){
                char c=(char)(w);
                dic.put(c,i);
                w=w+1;
            }
            else {
                char c=(char)(k);
                dic.put(c,i);
                k=k+1;
            }
        }
        System.out.println(dic);
    }
}
