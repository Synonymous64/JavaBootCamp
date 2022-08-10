import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float income;
        float tax = 0.0f;
        System.out.println("Enter your income statement in lacs");
        income = sc.nextFloat();
        if(income <= 2.5f){
            System.out.println("INVALID INPUT, PLEASE ENTER VALID INPUT");  
        } 
        if(income > 2.5f && income <= 5.0f){
            System.out.println("You have to pay 5% as a TAX");
            tax = tax + 0.05f * (income - 2.5f);
            System.out.printf("Your tax amount becomes : %.2f", tax);
        }
        if(income > 5.0f && income <= 10.0f){
            System.out.println("You have to pay 20% as a TAX");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (income - 5.0f);
            System.out.printf("Your tax amount becomes : %.2f", tax);
        }
        if(income > 10.0f){
            System.out.println("You have to pay 30% as a TAX");
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.20f * (10.0f - 5.0f);
            tax = tax + 0.30f * (income - 10.0f);
            System.out.printf("Your tax amount becomes : %.2f", tax);
        }
        sc.close();
    }
}
