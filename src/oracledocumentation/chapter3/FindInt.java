package oracledocumentation.chapter3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FindInt {
    private final Path file;

    FindInt(Path file) {
        this.file = file;
    }

    public static void main(String[] args) {
        Path file = Paths.get("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/datafile");
        int num = new FindInt(file).seek();
        System.out.println("The value is " + num);
    }

    public int seek() {
        int num = -1;
        try (SeekableByteChannel fc = Files.newByteChannel(file)) {
            ByteBuffer buf = ByteBuffer.allocate(8);
            //Get the offset into the file.
            fc.read(buf);
            long offset = buf.getLong(0);
            //Seek to the offset location.
            fc.position(offset);
            buf.rewind();
            //Read the 'secret' value.
            fc.read(buf);
            num = buf.getInt(0);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return num;
    }
}
