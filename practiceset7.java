public class practiceset7 {
    public static void multiplication(int num) {
        for(int i = 1; i <= 10; ++i){
            System.out.printf("%d * %d = %d\n", num, i, num*i);
        }
    }
    public static void pattern1(int num) {
        for(int i = 0; i < num; ++i){
            for(int j = 0; j <= i; ++j){
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        
    }
    //! Recursion here for pattern
    public static void pattern1Rec(int num) {
        if(num > 0){
            pattern1Rec(num - 1);
            for(int i = 0; i < num; ++i){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void pattern2Rec(int num, int k) {
        if(num < 1) return;
        if(k <= num){
            System.out.print("* ");
            pattern2Rec(num, k + 1);
        }
        else {
            System.out.println();
            pattern2Rec(num - 1, 1);

        }
    }
    public static void pattern2(int num){
        for(int i = 0; i < num; ++i){
            for(int j = i + 1; j <= num; j++){
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    }
    public static int sumofNnaturalnumbers(int num){
        if(num == 0) return 0;
        return sumofNnaturalnumbers(num - 1) + num;
        
    }
    public static int repeat4(int num) {
        if(num == 1) return 4;
        System.out.println(4);
        return repeat4(num - 1);
    }
    public static int repeat2(int num) {
        if(num == 1) return 2;
        System.out.println(2);
        return repeat2(num - 1);
    }
    //! Celsius into farenhiet
    public static int toFarenhiet(int celsius) {
        int farenhiet = 0;
        farenhiet = ((celsius/5) * 9) + 32;
        return farenhiet;
    }
    public static void main(String[] args) {
        // multiplication(5);
        // pattern1(5);
        // pattern2(5);
        // System.out.println(sumofNnaturalnumbers(6));
        // System.out.println(repeat4(6));
        // System.out.println(repeat2(4));
        // System.out.println(toFarenhiet(25) + "F");
        // pattern1Rec(4);
        pattern2Rec(5, 1);
    }
}
