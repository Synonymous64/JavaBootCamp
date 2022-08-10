import java.util.Scanner;
//* Creating the exception class and derieving/custom exception our own exceptions --->
class myException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am  getMessage";
    }
}
class myException1 extends Exception{
    @Override
    public String toString(){
        return "Age shall be lesser than 125";
    }
    @Override
    public String getMessage(){
        return "Please enter the correct age";
    }
}
public class theExceptionClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        a = sc.nextInt();
        if(a < 9){
            try{
                sc.close();
                //! The throw exception is used to throw the exception explicitly (use "new" keyword).
                // throw new myException();
                throw new ArithmeticException("You wassup mate: This is an Exception!");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes, Finished");
        } 
    }
}
