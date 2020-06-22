package oracledocumentation.chapter5;

import java.time.LocalDateTime;

public class CurrentDateAndTimeThroughJodaDateAndTimeAPI {
    public static void main(String[] args) {
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current Date and Time:" + currentDateAndTime);
    }
}
