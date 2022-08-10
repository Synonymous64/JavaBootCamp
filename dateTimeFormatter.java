import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class dateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dt.format(df); // creating date string using formatter and date
        System.out.println(myDate);
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate2 = dt.format(df2);
        System.out.println(myDate2);
        //* Creating a custom Format
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //* we can create any format through this but the date time symbols remains the same
        String myDate3 = dt.format(df3);
        System.out.println(myDate3);
        DateTimeFormatter df4 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); //* we can create any format through this but the date time symbols remains the same
        String myDate4 = dt.format(df4);
        System.out.println(myDate4);
    }
}
