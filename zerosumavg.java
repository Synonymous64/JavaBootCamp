import java.util.*;

class zerosumavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num = sc.nextInt();
        int sum = 0;
        float avg = 0;
        while (num != 0) {
            sum += num;
            avg = (sum/2);
            num = sc.nextInt();
        }
        System.out.println("The sum is:"+sum);
        System.out.println("The average is:"+avg);
        sc.close();
    }
}
