import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int leapYear;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        leapYear = sc.nextInt();
        if(((leapYear % 4 == 0) && (leapYear % 100 != 0)) || leapYear % 400 == 0){
            System.out.println(leapYear + " is a leap year");
        }
        else System.out.println(leapYear + " is not a leap year");
        sc.close();
    }
}
