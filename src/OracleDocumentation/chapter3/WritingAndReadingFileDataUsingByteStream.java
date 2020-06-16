package OracleDocumentation.chapter3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This Class Explains about reading a byte data from a file
 * and writing it to another file
 */
public class WritingAndReadingFileDataUsingByteStream {
        /*
        * For Character Stream We  will be using
        * FileReader and FileWriter Class
         */
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;
        public void readAndWriteData() throws IOException {
                try
                {
                        fileInputStream=new FileInputStream("OutFile.txt");
                        fileOutputStream=new FileOutputStream("input.txt");
                        int number=fileInputStream.read();
                        while (number!=-1)
                        {
                                fileOutputStream.write(number);
                                fileOutputStream.flush();
                                number=fileInputStream.read();
                        }
                }
                catch (FileNotFoundException fileNotFoundException) {
                       fileNotFoundException.printStackTrace();
                }
                catch (IOException ioException){
                        ioException.printStackTrace();
                }
                finally {
                        if (fileOutputStream!=null) {
                                fileOutputStream.close();
                        }
                        if (fileInputStream!=null)
                        {
                                fileInputStream.close();
                        }
                }
        }

        public static void main(String[] args) throws IOException {
                WritingAndReadingFileDataUsingByteStream writingAndReadingFileDataUsingByteStream=new WritingAndReadingFileDataUsingByteStream();
                writingAndReadingFileDataUsingByteStream.readAndWriteData();
        }
}
