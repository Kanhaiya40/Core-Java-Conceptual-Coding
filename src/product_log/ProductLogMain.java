package product_log;

import java.io.IOException;

public class ProductLogMain {

    public static void main(String[] args) throws IOException {
        String filePath = "/home/kanhaiya/Desktop/sample1.txt";
        ItemIdVsBuyCount itemIdVsBuyCount = new ItemIdVsBuyCount(filePath);
        System.out.println(itemIdVsBuyCount.getData());
    }
}