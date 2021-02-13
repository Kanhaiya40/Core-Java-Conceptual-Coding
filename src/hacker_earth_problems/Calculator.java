package hacker_earth_problems;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNumber=scanner.nextInt();
        char ch=scanner.next().charAt(0);
        int secondNumber=scanner.nextInt();
        switch (ch){
            case '+':callSum(firstNumber,secondNumber);
            break;
            case '-':callMinus(firstNumber,secondNumber);
            break;
            case '*':callMultiple(firstNumber,secondNumber);
            break;
            case '/':callDivision(firstNumber,secondNumber);
            break;
            default:
                System.out.println("Invalid Operator");
        }
    }

    private static void callDivision(int firstNum,int secondNum) {
        float res=(float)firstNum/secondNum;
        System.out.println(res);
    }

    private static void callMultiple(int firstNum,int secondNum) {
        int res=firstNum*secondNum;
        System.out.println(res);
    }

    private static void callMinus(int firstNum,int secondNum) {
        int res=firstNum-secondNum;
        System.out.println(res);
    }

    private static void callSum(int firstNum,int secondNum) {
        int res=firstNum+secondNum;
        System.out.println(res);
    }
}
