package product_log;

import java.io.IOException;

public class ProductLogMain {
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        System.out.println(parser.parse());
    }
}