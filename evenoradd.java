import java.util.*;
public class evenoradd {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter the number of your choice");
        int num = 1;
        int oddCount = 0, evenCount = 0;
        
        for(int i = 0; i < Integer.MAX_VALUE; ){
            num = input.nextInt();
            if(num % 2 == 0) evenCount++;
            else oddCount++;
            if(oddCount > 9 && evenCount > 9) break;
        }
        System.out.println("The even and odd have inputed till 10");
        input.close();
    }
}
