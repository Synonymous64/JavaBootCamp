import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // String name = new String ("Prajwal");
        String name = "Prajwal"; // String are immutable, it cannot be changed
        System.out.print("The name is ");
        System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and b is %7.4f\n",a,b); // similar to c/cpp
        //! System.out.format("The value of a is %d and b is %.4f",a,b);
        Scanner sc = new Scanner(System.in);
        // String s = sc.next();
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();

        
    }
}
