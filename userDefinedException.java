//! User Defined exceptions 
import java.util.*;
public class userDefinedException extends Exception{
    public userDefinedException(String s){
        super(s);
    }
    public static void main(String[] args) {
        String pass = "666";
        try{
            Scanner input = new Scanner(System.in);
            String check = input.nextLine();
            input.close();
            if(!check.equals(pass)) throw new userDefinedException("wrong password");
            System.out.println("correct password");
        } catch(userDefinedException e){
            System.out.println(e.getMessage());
        }
    }
}