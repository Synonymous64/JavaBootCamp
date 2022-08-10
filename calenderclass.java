import java.util.*;
public class calenderclass {
    public static void main(String[] args) {
        Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore")); //* calling calender module with the time you want 
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone()); //Printing time zone
        System.out.println(c.getTimeZone().getID());//Printing ID
    }
}
