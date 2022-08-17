// package pseason;
import java.util.Scanner;
public class season {
    public static void main(String[] args) {
        boolean infinity = true;
        while(infinity){
            int month = 4;
            String Season;
            System.out.println("Enter your month");
            Scanner scan = new Scanner(System.in);
            month = scan.nextInt();
            switch (month)
            {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
    
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
    
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
    
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
    
                default:
                    System.out.println("Invalid month");
            }
            System.out.println("Press Q/q to quit or press any key to continue");
            Season = scan.nextLine();
            Season = scan.nextLine();
            if(Season.equals("Q") || Season.equals("Q")){
                infinity = false;
                scan.close();
            }
        }
    }
}
