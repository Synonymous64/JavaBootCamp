import java.util.Scanner;
class myException extends Exception{
    @Override
    public String toString(){
        return "Invalid Input Exception found try again";
    }
    @Override
    public String getMessage(){
        return "Max Input Exception ~Greater than 100000~";
    }
    public String overFlow(){
        return "MAX Input Exception for product is ~7000~";
    }
    public String noZero(){
        return "Exception can't divide by zero";
    }
}
public class customCalculator{
    public void myCalculator(){
        int num1, num2;
        System.out.println("Hello Users ~ I am a custom calculator which throws custom Exceptions depending upon the I/O");
        System.out.println("Lets Get started :)");
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Please Enter your name ;)");
        name = sc.nextLine();
        System.out.println("____________________________________\n");
        while(flag){
            String choice;
            System.out.println(name + "! Kindly choose your operator");
            System.out.println("Press the following commands -:\nPress '+' for addition\nPress '-' for subtraction\nPress '*' for product\nPress '/' for division\n");
            choice = sc.next();
            if(!(choice.equals("+") || choice.equals("-") || choice.equals("*") || choice.equals("/"))){
                try{
                    throw new myException();
                }
                catch(myException e){
                    System.out.println(e.toString());
                    continue;
                }
            }
            try{
                System.out.println(name + "! Enter your first number");
                num1 = sc.nextInt();
                System.out.println(name + "! Now, Enter your second number");
                num2 = sc.nextInt();
                if(num1 > 100000 || num2 > 100000){
                    try{
                        throw new myException();
                    }
                    catch(myException e){
                        System.out.println(e.getMessage());
                        System.out.println("_________________________\n");
                        continue;
                    }
                }
                switch(choice){
                    case "+" : {
                        System.out.println("The sum of the Integers " + num1 + " and " + num2 + " is " + (int)(num1 + num2));
                        System.out.println("_________________________________________________\n");
                        break;
                    }
                    case "-" : {
                        System.out.println("The difference of the Integers " + num1 + " and " + num2 + " is " + (int)(num1 - num2));
                        System.out.println("__________________________________________________\n");
                        break;
                    }
                    case "*" : {
                        if(num1 > 7000 || num2 > 7000){
                            try{
                                throw new myException();
                            }
                            catch(myException e){
                                System.out.println(e.overFlow());
                                System.out.println("__________________________________________\n");
                                continue;
                            }
                        }
                        System.out.println("The product of the Integers " + num1 + " and " + num2 + " is " + (int)(num1 * num2));
                        System.out.println("___________________________________________\n");
                        break;
                    }
                    case "/" : {
                        if(num2 == 0){
                            try{
                                throw new myException();
                            }
                            catch(myException e){
                                System.out.println(e.noZero());
                                System.out.println("________________________________________\n");
                                continue;
                            }
                        }
                        System.out.println("The quotient of the Integers " + num1 + " and " + num2 + " is " + (int)(num1 / num2));
                        System.out.println("___________________________________________\n");
                        break;
                    }
                }
                System.out.println("Wanna Continue again");
                String s;
                System.out.println("_____________________________________________\n");
                System.out.println("Press 'Y' or 'N' to continue or quit, respectively");
                s = sc.next();
                if(s.equals("Y") || s.equals("y")){
                    System.out.println("Let's do it one more time ;)");
                    System.out.println("_________________________________________\n");
                }
                else if(s.equals("N") ||  s.equals("n")){
                    System.out.println("Great Day Ahead ;)");
                    flag = false;
                }
                else{
                    try{
                        throw new myException();
                    }
                    catch(myException e){
                        System.out.println(e.toString());
                        continue;
                    }
                }
            }
            catch(Exception e){
                System.out.println("Enter Valid input");
                continue;
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        customCalculator c = new customCalculator();
        c.myCalculator();
    }
}