package com.cognitree.exercise.util;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileUtil {
    public static void writeToFile(BufferedWriter writer, String part) throws IOException {
        writer.write(part.trim());
        writer.newLine();
    }
}
