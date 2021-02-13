package test_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PathResolver {

    public static void main(String[] args) {
        List<Integer> outputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        for (int i = 0; i < testCase; i++) {
            int noOfBlocks = scanner.nextInt();
            int[] blocks = new int[noOfBlocks];
            for (int j = 0; j < noOfBlocks; j++) {
                blocks[j] = scanner.nextInt();
            }
            int maxLength = calculateMaxPathLength(blocks);
            outputs.add(maxLength);
        }
        for (int output : outputs) {
            System.out.println(output);
        }
    }

    private static int calculateMaxPathLength(int[] paths) {
        Stack<Integer> blockes=new Stack<>();
        int count=0;
        for (int path:paths) {
            blockes.push(path);
        }
        while (!blockes.isEmpty()){
            if (blockes.pop()>blockes.peek()){
                count++;
            }
        }
        return count;
    }
}
