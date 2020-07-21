package data_extraction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Parser {

    private final List<PurchaseEvent> purchaseEvents = new ArrayList<>();
    private final Set<Integer> uniqueItemId = new HashSet<>();
    private final String filePath;

    public Parser(String filePath) throws IOException {
        this.filePath = filePath;
        parse();
    }


    public void parse() throws IOException {
        FileReader fileReader = new FileReader(filePath);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String eachLine = bufferedReader.readLine();
            while (eachLine != null) {
                String[] eachLineSeparator = eachLine.split(",");
                PurchaseEvent purchaseEvent = new PurchaseEvent(Integer.parseInt(eachLineSeparator[0]), eachLineSeparator[1],
                        Integer.parseInt(eachLineSeparator[2]), Integer.parseInt(eachLineSeparator[3]),
                        Integer.parseInt(eachLineSeparator[4]));
                uniqueItemId.add(Integer.parseInt(eachLineSeparator[2]));
                purchaseEvents.add(purchaseEvent);
                eachLine = bufferedReader.readLine();
            }
        }
    }

    public List<PurchaseEvent> getPurchaseEvents() {
        return purchaseEvents;
    }

    public Set<Integer> getUniqueItemId() {
        return uniqueItemId;
    }
}
