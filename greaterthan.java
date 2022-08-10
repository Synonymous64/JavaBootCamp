import java.util.Scanner;
public class greaterthan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, p;
        System.out.println("Enter first number");
        s = sc.nextInt();
        System.out.println("Enter second number");
        p = sc.nextInt();
        if(s > p) System.out.println(s + " is Greater");
        else if(s < p) System.out.println(p + " is Greater");
        else System.out.println("Equal");
        sc.close();
    }
}
