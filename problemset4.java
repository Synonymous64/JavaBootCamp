import java.util.Scanner;

public class problemset4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        while(n >= 0){    
            float sub1,sub2, sub3, total;
            System.out.println("Enter the marks for Math");
            sub1 = sc.nextInt();
            sub1 = (sub1 / 30) * 100;
            System.out.println("Enter the marks for physics");
            sub2 = sc.nextInt();
            sub2 = (sub2 / 30) * 100;
            System.out.println("Enter the marks for Chemistry");
            sub3 = sc.nextInt();
            sub3 = (sub3 / 30) * 100;
            if(sub1 < 33 || sub2 < 33 || sub3 < 33)System.err.println("Failed");
            else {
                System.out.format("CONGRATULATIONS! YOU GOT SUCCESSFULLY PASSED WITH THE FOLLOW SCORES\n %.2f is MATH\n %.2f in PHYSICS\n %.2f in CHEMISTRY\n", sub1, sub2, sub3);
                total = ((sub1 + sub2 + sub3)/ 3.0f) ; //! This is how you take out average
                System.out.format("YOUR TOTAL PERCENTAGE IS %.2f\n", total);
                // System.out.println(total);
                if(total < 40) System.out.println("STILL YOU COULDN'1T ABLE TO QUALIFY FOR THE NEXT SEMESTER, YOUR TOTAL IS LOWER THAN 40%");
            }
            n--;
        }
        sc.close();
    }
}
