package hacker_earth_problems;

/*
 * Save this in a file called Main.java and compile it. To test it
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/*
   Example file showing how to write a program that reads
   input from `input.txt` in the current directory
   and writes output to `output.txt` in the current directory
*/

/* Do not add a package declaration */

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

/* Do not add a namespace declaration */

public class Main {
    public static void main(String[] args) {

        int numLines = 0;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("/home/kanhaiya/Desktop/Spring/Java_Conceptual_code/src/hacker_earth_problems/input.txt")));
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("/home/kanhaiya/Desktop/Spring/Java_Conceptual_code/src/hacker_earth_problems/output.txt")));
            /* Here we can read in the input file */
            /* In this example, we're reading all the lines of file
               `input.txt` and then ignoring them.
               You should modify this part of the
               program to read and process the input as desired */
            while (in.hasNextLine()) {
                Stack<String> input = new Stack<>();
                String line = in.nextLine();
                System.out.println(line);
                while (!line.isEmpty() && in.hasNextLine()) {
                    input.push(line);
                    line = in.nextLine();
                }
                while (!input.isEmpty()) {
                    output.println("" + input.pop());
                    output.flush();
                }
                if (!in.hasNextLine()) {
                    output.println("" + line);
                }
                output.println("");
                numLines++;
            }

            /* In this example, we're writing `num_lines` to
               the file `output.txt`.
               You should modify this part of the
               program to write the desired output */


            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt");
        }
    }
}
