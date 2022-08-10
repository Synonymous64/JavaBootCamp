public class recursion {

    public static int febonacci(int num){
        if(num == 0 || num == 1){
            return num;
        }
        return febonacci(num - 1) + febonacci(num - 2); 
        
    }
    public static int factorial(int num){
        if(num == 0) return 1;
        return factorial(num - 1) * num;
    }
    public static void main(String[] args) {
        // for(int i = 0; i < 4; ++i){
        //     System.out.println(febonacci(i));
        // }
        System.out.println(factorial(4));
    }
}
