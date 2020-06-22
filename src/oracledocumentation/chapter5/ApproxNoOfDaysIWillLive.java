package oracledocumentation.chapter5;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class ApproxNoOfDaysIWillLive {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate approxDate = LocalDate.of(2080, Month.APRIL, 2);
        Period period = Period.between(currentDate, approxDate);
        System.out.println("Approx No Of Days I will live is:" + period.getYears() * 365 + " Days");
    }
}
