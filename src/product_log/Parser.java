package product_log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List<Product> parse() throws IOException {
        List<Product> products = new ArrayList<>();
        FileReader fileReader = new FileReader("/home/kanhaiya/Desktop/sample1.txt");
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String eachLine = bufferedReader.readLine();
            while (eachLine != null) {
                String[] eachLineSeparator = eachLine.split(",");
                Product product = new Product(Integer.parseInt(eachLineSeparator[0]), eachLineSeparator[1],
                        Integer.parseInt(eachLineSeparator[2]), Integer.parseInt(eachLineSeparator[3]),
                        Integer.parseInt(eachLineSeparator[4]));
                products.add(product);
                eachLine = bufferedReader.readLine();
            }
        }
        return products;
    }
}
