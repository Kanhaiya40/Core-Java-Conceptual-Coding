package product_log;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemIdVsBuyCount {
    private final List<Product> products;
    ItemIdVsBuyCount(String filePath) throws IOException {
        Parser parser=new Parser();
        parser.parse(filePath);
        products=parser.getProducts();
    }

    public Map<Integer,Integer> getData(){
        Map<Integer,Integer> itemIdVsBuyCountData=new HashMap<>();
        for (Product product:products) {
            if (product.getQuantity()>0){
                itemIdVsBuyCountData.put(product.getItemId(),product.getQuantity());
            }
        }
        return itemIdVsBuyCountData;
    }
}
