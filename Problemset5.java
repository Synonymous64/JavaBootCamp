public class Problemset5{
    public static void main(String[] args) {
        //! Pattern Printing
        // for(int i = 0; i < 5; ++i){
        //     for(int j = i + 1; j < 5; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.printf("\n");
        // }
        //! Printing sum of first three even number
        //     int sum = 0;
        //     for(int i = 0; i < 4; ++i){
        //         sum += (i * 2);
        //     }
        //     System.out.println(sum);
        // }
        //! Product Table
        // int n = 29;
        // for(int i = 1; i <= 10; ++i){
        //     System.out.printf("%d * %d =  %d\n", n, i, n * i);
        // }
        //! Product Table in reverse order
        // int n = 10;
        // for(int i = 10; i >= 1; --i){
        //     System.out.printf("%d * %d =  %d\n", n, i, n * i);
        // }
        //! Factorial of Given number
        // int n = 4;
        // int sum = 1;
        // for(int i = 1; i <= n; ++i){
        //     sum *=  i;
        // }
        // System.out.println(sum);
        //! Repeat 5
        // int n = 5;
        // while(n > 0){
        //     System.out.println(5);
        //     n--;
        // }
        //! Sum of numbers occuring in the multiplication table of 8
        int n = 8;
        int sum = 0;
        for(int i = 1; i <= 10; ++i){
            sum += (n * i);
        }
        System.err.println(sum);
    }    
}