import java.util.Scanner;
public class nelson {
    int countNum(int n){
        int count = 0;
        while(n != 0){
            count++;
            n /= 10;
        }
        return count;
    }
    boolean findNelsonNum(int num){
        int size = countNum(num);
        if(size <= 2) return false;
        int[] arr = new int[size];
        int rem = 0;
        for(int i = 0; i < size; ++i){
            rem = num % 10;
            arr[i] = rem;
            num /= 10;
        }
        for(int i = 0; i < arr.length;){
            if(rem == arr[i]) ++i;
            else return false;
        }
        return true;

    }
    public static void main(String[] args) {
        // nelson s = new nelson();
        // int num = 0;
        // System.out.println("Enter the number that you wanna enter - :");
        Scanner input = new Scanner(System.in);  
        // num = input.nextInt();
        // int size = s.countNum(num);
        // if(size <= 2) System.out.println("Size lesser than 3.");
        // if(s.findNelsonNum(num) == true)
        //     System.out.println("The size of number is " + size + " which is a Nelson number");
        // else System.out.println("The number of size " + size + " which is not a Nelson number");
        char[] c = {'p','e'};
        char ch = input.next().charAt(0);
        System.out.println(ch);
        for(int i = 0; i < c.length; ++i){
            System.out.println(c[i]);
        }
        input.close();
    }
}
