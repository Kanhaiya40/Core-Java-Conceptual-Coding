package data_extraction.streaming_concept;

import data_extraction.PurchaseEvent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Parser {

    private final List<PurchaseEvent> purchaseEvents = new ArrayList<>();
    private final String filePath;
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");

    public Parser(String filePath) throws IOException {
        this.filePath = filePath;
        parse();
    }

    public Stream<PurchaseEvent> parse() throws IOException {
        Stream<String> eachLine = Files.lines(Paths.get(filePath));
        return eachLine.map(lines -> {
            String[] instantLine = lines.split(",");
            return new PurchaseEvent(Integer.parseInt(instantLine[0]), LocalDateTime.parse(instantLine[1], dateTimeFormatter), Integer.parseInt(instantLine[2]), Integer.parseInt(instantLine[3]), Integer.parseInt(instantLine[4]));
        });
    }

    public List<PurchaseEvent> getPurchaseEvents() {
        return purchaseEvents;
    }
}
