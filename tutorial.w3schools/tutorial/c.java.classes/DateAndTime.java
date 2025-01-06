import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate objDay = LocalDate.now();
        LocalTime objTime = LocalTime.now();
        LocalDateTime objDatTime = LocalDateTime.now();

        System.out.println("Hello World " + objDay + " ---- " + objTime + " ---- " + objDatTime );
    }   
}
