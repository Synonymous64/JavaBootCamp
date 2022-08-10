import java.util.Scanner;

public class nestedtryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        Scanner sc = new Scanner(System.in);
        int ind = 0;
        System.out.println("Enter the value of index : ");
        ind = sc.nextInt();
        try{
            System.out.println("Welcome to our program");
            try{

                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry, This index does not exist");
                System.out.println("Exception in level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception in level 1");
        }
        sc.close();
    }
}
