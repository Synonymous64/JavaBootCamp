/*
! The Finally blocks contains the code which is always executed irrespective of exception is handled or not
* It is used to execute code containing instruction to release the system resources, close a connection etc.
*/
class myException extends Exception{
    @Override
    public String toString(){
        return "Input should be positive number";
    }
}
public class finallyBlock {
    public int greet(){
        try{
            int a = 9;
            int b = 6;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        //* Even if your conditions are all valid in try but still the finally block will be getting executed especially in returning type function.
        // finally{
            System.out.println("Cleaning up ~ Resources");
        // }
        return -1;
    }
    public int greet1(){
        try{
            int a = 9;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        //* Even if your conditions are all valid in try but still the finally block will be getting executed especially in returning type function.
        finally{
            System.out.println("Cleaning up ~ Resources");
        }
        return -1;
    }
    public void loopquiz(int target){
        try{
            if(target > 0){               
                for(int i = 0; i < Integer.MAX_VALUE; ++i){
                    System.out.println(i);
                    if(i == target) break;
                }
            }
            else{
                throw new myException();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        //* Even if your conditions are all valid in try but still the finally block will be getting executed especially in returning type function.
        finally{
            System.out.println("Cleaning up ~ Resources");
        }
    }
    public static void main(String[] args) {
        finallyBlock b  = new finallyBlock();
        // System.out.println(b.greet());
        b.loopquiz(-9);
        //! We can also write finally with try without catch
        // try{
        //     System.out.println(9/0);
        // }
        // finally{
        //     System.out.println("Yes we can write 'finally' after try instead of catch");
        // }
    }
}
