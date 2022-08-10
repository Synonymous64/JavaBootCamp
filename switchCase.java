import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.println("Enter your age");
        age = sc.nextInt();
        switch(age){
            case 16 -> System.out.println("YOU ARE STILL A KID");
            case 19 -> System.out.println("NOW YOU ARE IN YOUR TWENTIES");
            case 80 -> System.out.println("NOW YOU ARE AN SENIOR RESIDENT");
            default -> System.out.println("INVALID INPUT PROVIDED");
        }
        sc.close();
    }
}