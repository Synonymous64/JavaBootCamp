import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2");
        // int b = sc.nextInt();
        // int sum = a + b;
        
        // System.out.println("The sum of the number is");
        // System.out.println(sum);
        // System.out.println("In the case of float");
        // System.out.println("The sum of the number is");
        // float c = sc.nextFloat();
        // float d = sc.nextFloat();
        // float sum1 = c + d;
        // System.out.println(sum1);
        // boolean b = sc.hasNextInt(); //! it will check if the input taken is valid or not
        // System.out.println(b);
        // String str = sc.next();
        String str = sc.nextLine(); //! to print the whole line from the string 

        System.out.println(str);
        sc.close();
    }
}
