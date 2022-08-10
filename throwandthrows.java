//* Creating custom Exceptions
class myException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
}
public class throwandthrows{
    //! The throws function indicates that there can possibly be the arithmetic exception in the program on any other exception
    int divide(int a, int b) throws ArithmeticException{ //*warning it could return Arithmetic exception 
        int result = a / b;
        return result;
    }  
    // public static float area(int r) throws myException{
    //     if(r < 0){
    //         throw new myException(); //* throwing custom exception
    //     }
    //     float result = (float)( Math.PI * r * r);
    //     return result;
    // }    
    public static void main(String[] args) {
        // throwandthrows t = new throwandthrows();
        // try{
        //     System.out.println(t.divide(6, 2));
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // try{
        //     float ar = area(6);
        //     System.out.println(ar);
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
    }
}