import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        System.out.println("Calculating your marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your English Marks");
        float English = sc.nextFloat();
        System.out.println("Enter your Math Marks");
        float Math = sc.nextFloat();
        System.out.println("Enter your Science Marks");
        float Science = sc.nextFloat();
        System.out.println("Enter your History Marks");
        float History = sc.nextFloat();
        System.out.println("Enter your Geography Marks");
        float Geography = sc.nextFloat();
        System.out.println("Your Total marks is -: ");
        float totalMarks = English + Math + Science + History + Geography;
        System.out.println(totalMarks);
        float percentage = ((totalMarks)/ 100) * 100;
        System.out.println("Percentage would be -:");
        System.out.println(percentage); 

        sc.close();

    }
}
