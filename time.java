import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
    }
}
