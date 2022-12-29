import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormatter {
    public void dateAndTimeFormat(){
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy - E");
        String date = dt.format(df);
        System.out.println(date);
    }
    public static void main(String[] args) {
        DateAndTimeFormatter p = new DateAndTimeFormatter();
        p.dateAndTimeFormat();
    }
}
