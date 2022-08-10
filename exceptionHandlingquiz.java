import java.util.Scanner;

public class exceptionHandlingquiz {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Boolean flag = true;
        int ind = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("It will keep looping until you guess the allocated index");
        while(flag){
            System.out.println("Enter any index --> ");
            ind = sc.nextInt(); 
            try{
                try{
                    System.out.println(arr[ind]);
                    flag = false;
                }
                catch(Exception e){
                    System.out.println("This is an Exception level 1 --> Continuing Exception");
                }
            }catch(Exception e){
                System.out.println("This is an Exception level 2");
            }
        }
        System.out.println("Thanks for using this program");
        sc.close();
    }
}
