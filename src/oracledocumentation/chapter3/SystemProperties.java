package oracledocumentation.chapter3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/home/shubh/IdeaProjects/Java_Conceptual_code/resources/input.txt");
        Properties properties = new Properties(System.getProperties());
        properties.load(fileInputStream);
        System.setProperties(properties);
        System.getProperties().list(System.out);
    }
}
