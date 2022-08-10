import java.util.Scanner;

public class handlingSpecficException {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = 0;
        int number = 0;
        ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with - : ");
        number = sc.nextInt();
        try{
            //* For Checking two type of exceptions input/output and arithmetic.
            //* In the first case input value can be out of the index of array. -- INPUT/OUTPUT EXCEPTION
            //* In the second case input number can't be divided from the values in array like 0. -- ARITHMETIC EXCEPTION
            System.out.println("The value at array index entered is " + marks[ind]); 
            System.out.println("The value at array-value/number is after dividing " + marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("SOME EXCEPTION OCCURED : " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("SOME EXCEPTION OCCURED : " + e);
        }
        catch(Exception e){
            System.out.println("SOME OTHER EXCEPTION OCCURED : " + e);
        }
        sc.close();
    }
}
