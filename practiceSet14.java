import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString(){
        return "It's more than 5";
    }
    @Override
    public String getMessage(){
        return "Max retries reached";
    }
}

public class practiceSet14 {
    public void forPractice(){
        try{
            int a = 1;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Halo");
            System.out.println(e);
        }
        catch(IllegalArgumentException e){
            System.out.println("Hehe");
            System.out.println(e);
        }
    }
    void findValidindex() throws myException{
        int[] arr = {5,4,3,2,1};
        try{
            System.out.println("Executing out looping program");
            int a = 5;
            boolean flag = true;
            while(a > 0 && flag){
                try{
                    Scanner sc = new Scanner(System.in);
                    int ind;
                    ind = sc.nextInt();
                    System.out.println(arr[ind]);
                    flag = false;
                    sc.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                if(a == 1){
                    throw new myException();
                }
                a--;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // practiceSet14 p = new practiceSet14();
        // p.forPractice();
        practiceSet14 p = new practiceSet14();
        // p.forPractice();
        try{
            p.findValidindex();
        }
        catch(myException e){
            System.out.println(e.getMessage());
        }
    
    }
}
