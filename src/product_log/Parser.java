package product_log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private final List<Product> products = new ArrayList<>();

    public void parse(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
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
    }

    public List<Product> getProducts() {
        return products;
    }

}
