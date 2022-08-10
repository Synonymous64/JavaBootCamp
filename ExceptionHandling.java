public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 4000;
        int b = 10;
        try{
            int c = a / b; //* if it gives an error ~ the catch section will be getting printed the exception e stores the errors
            System.out.println(c);        
        }
        catch(Exception e){ //! If the context / condition is valid it will print try section thus the catch will be ignored
            System.out.format("We Failed to divide reason : ");
            System.out.println(e);
        }
        //* If you do it without try-catch you won't be able to reach till the end of the program. 
        System.out.println("END OF THE PROGRAM");        

    }
}
