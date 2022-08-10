import java.util.*;
class realSumavg {
    public static void main(String[]args)  {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.println("Enter the " + i + " number");
            int num=sc.nextInt();
            sum=sum+num;
            System.out.println("The sum at number " + i + " is " + sum);
        }
        sc.close();
    }
}