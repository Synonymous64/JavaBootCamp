import java.util.*;

public class loopL18 {
    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int choice;
            int sum = 0;
            int sum2 = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum = sum + i;
                    System.out.println("sum of even number is = " + sum);
                } else {
                    sum2 = sum2 + i;
                    System.out.println("sum of odd number is = " + sum2);

                }
            }
            System.out.println("Do you want to continue ? yes = 1 or no = 0 ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the number: ");
                continue;
            } else {
                System.out.println("End");
                sc.close();
                break;
            }
        }
    }
}