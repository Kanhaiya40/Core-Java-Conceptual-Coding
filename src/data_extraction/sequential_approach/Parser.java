package data_extraction.sequential_approach;

import data_extraction.PurchaseEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    private final List<PurchaseEvent> purchaseEvents = new ArrayList<>();
    private final String filePath;
    private final DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");

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
                PurchaseEvent purchaseEvent = new PurchaseEvent(Integer.parseInt(eachLineSeparator[0]),
                        LocalDateTime.parse(eachLineSeparator[1], dateTimeFormatter),
                        Integer.parseInt(eachLineSeparator[2]), Integer.parseInt(eachLineSeparator[3]),
                        Integer.parseInt(eachLineSeparator[4]));
                purchaseEvents.add(purchaseEvent);
                eachLine = bufferedReader.readLine();
            }
        }
    }

    public List<PurchaseEvent> getPurchaseEvents() {
        return purchaseEvents;
    }
}
