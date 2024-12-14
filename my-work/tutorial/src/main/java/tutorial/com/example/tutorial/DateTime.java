package tutorial.com.example.tutorial;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date--------" + date);  // Output: 2024-12-03
        System.out.println("time--------" +time);  // Output: 10:30
        System.out.println("dateTime----" +dateTime);  // Output: 2024-12-03T10:30
    }
}
