import java.util.Scanner;

class myException extends Exception {
    myException(){

    }

    public myException(String s) {
        super(s);
    }
}

public class ExceptionUseDefined extends myException {
    private String pass;

    public void Checker() {
        try {
            Scanner sc = new Scanner(System.in);
            pass = sc.nextLine();
            sc.close();
            if (!pass.equals("java"))
                throw new myException("No Match");
            sc.close();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
    }

    public static void main(String[] args) {
        ExceptionUseDefined x = new ExceptionUseDefined();
        x.Checker();
    }
}
