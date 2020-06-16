package OracleDocumentation.chapter3;

import java.io.*;

/**
 * Modify the following cat method so that it will compile.
 * public static void cat(File file) {
 *     RandomAccessFile input = null;
 *     String line = null;
 *
 *     try {
 *         input = new RandomAccessFile(file, "r");
 *         while ((line = input.readLine()) != null) {
 *             System.out.println(line);
 *         }
 *         return;
 *     } finally {
 *         if (input != null) {
 *             input.close();
 *         }
 *     }
 * }
 *
 * ouput---
 * This row contain 5 elements
 */
public class ModifyingCatMethod {
        public static void cat(File file) throws IOException {
                RandomAccessFile input = null;
                String line = null;

                try {
                        input = new RandomAccessFile(file, "r");
                        while ((line = input.readLine()) != null) {
                                System.out.println(line);
                        }
                        return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                  illegalArgumentException.printStackTrace();
                }
                        finally
                        {
                        if (input != null) {
                                input.close();
                        }
                }
        }

        public static void main(String[] args) {
                ModifyingCatMethod modifyingCatMethod=new ModifyingCatMethod();
                File file=new File("input.txt");
                try {
                        PrintWriter printWriter = new PrintWriter(file);
                        printWriter.print("This row contain 5 elements");
                        printWriter.flush();
                        printWriter.close();
                        cat(file);
                }
                catch (FileNotFoundException fileNotFoundException)
                {
                        fileNotFoundException.printStackTrace();
                }
                catch (IOException ioException){
                        ioException.printStackTrace();
                }


        }
}
