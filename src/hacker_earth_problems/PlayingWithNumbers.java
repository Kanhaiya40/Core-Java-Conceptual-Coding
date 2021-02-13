package hacker_earth_problems;

import java.util.Scanner;

public class PlayingWithNumbers {

    public static void main(String[] args) throws InterruptedException {
        StartingThread startingThread=new StartingThread();
        Thread starting=new Thread(startingThread);
        starting.start();
        starting.join();
        int[] element=startingThread.getElement();
        Thread thread=new Thread(new PlayingNum(element));
        thread.start();
        thread.join();
    }

}
class StartingThread extends Thread{
    int[] element;
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int noOfElements = scanner.nextInt();
        element = new int[noOfElements];
        for (int i = 0; i < noOfElements; i++) {
            element[i] = scanner.nextInt();
        }
    }

    public int[] getElement(){
        return element;
    }
}

class PlayingNum extends Thread {
    Scanner scanner = new Scanner(System.in);
    int[] elements;

    public PlayingNum(int[] elements) {
        this.elements = elements;
    }

    @Override
    public void run() {
        int noOfQueries = scanner.nextInt();
        int[] result = new int[noOfQueries];
        for (int i = 0; i < noOfQueries; i++) {
            int firstIndices = scanner.nextInt();
            int secondIndices = scanner.nextInt();
            int totalElements = 0;
            int totalSum = 0;
            for (int j = firstIndices - 1; j <= (firstIndices - 1) + (secondIndices - firstIndices); j++) {
                totalSum = totalSum + elements[j];
                totalElements++;
            }
            int avg = totalSum / totalElements;
            result[i] = avg;
        }
        for (int res : result) {
            System.out.println(res);
        }
    }
}
