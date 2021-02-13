package codechef;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner=new Scanner(System.in);
        float amountWithdraw=scanner.nextFloat();
        float beforeTransaction=scanner.nextFloat();
        if (amountWithdraw%5==0 && amountWithdraw>beforeTransaction){
            beforeTransaction=(beforeTransaction-amountWithdraw-0.5f);
        }
        System.out.println(df.format(beforeTransaction));
    }
}
