import java.util.Scanner;
public class practicearrays {
    public static float sumoffloat() {
        Scanner sc = new Scanner(System.in); 
        
        //! sum of floats
        float sum = 0;
        float[] arr = new float[5];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextFloat();
        }
        sc.close();
        for(int i = 0; i < arr.length; ++i){
            sum += arr[i];
        }
        return sum;
    }
    public static boolean ifPresent(int n){
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] == n) return true;
        }
        return false;
    }
    public static int calculateMarks(){
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }
    public static void addMatrix() {
        int[][] arr= new int[2][3];
        int[][] arr2= new int[2][3];
        int[][] res= new int[2][3];
        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i < 2; ++i){
            for(int j = 0; j < 3; ++j){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array one -: ");
        for(int i = 0; i < 2; ++i){
            for(int j = 0; j < 3; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
        for(int i = 0; i < 2; ++i){
            for(int j = 0; j < 3; ++j){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array two -: ");
        for(int i = 0; i < 2; ++i){
            for(int j = 0; j < 3; ++j){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("\n");
        }
        sc.close();
        for(int i = 0; i < 2; ++i){
            for(int j = 0; j < 3; ++j){
                res[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("Result -: ");
        for(int i = 0; i < 2; ++i){
            for(int j = 0; j < 3; ++j){
                System.out.print(res[i][j] + " ");
            }
            System.out.println("\n");
        }
        
    }
    public static void reverseArray() {
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = arr.length - 1; i >= 0; --i){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static int maxElement() {
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[5];
        int occurance = 0;
        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < arr.length; ++i){
            occurance = Math.max(occurance, arr[i]);
        }
        return occurance;
        
    }
    public static int minElement() {
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[5];
        int occurance = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < arr.length; ++i){
            occurance = Math.min(occurance, arr[i]);
        }
        return occurance;
        
    }
    boolean isSorted() {
        Scanner sc = new Scanner(System.in); 
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int flag = 0;
        for(int i = 0; i < arr.length - 1; ++i){
            if(arr[i] <= arr[i + 1]) flag++;
        }
        if(flag == arr.length - 1) return true;
        return false;
    }
    public static void main(String[] args) {
        
        // System.out.println(sumoffloat());
        // System.out.println(ifPresent((5)));
        // System.out.println(calculateMarks());
        // addMatrix();
        // reverseArray();
        // System.out.println(maxElement());
        // System.out.println(minElement());
        practicearrays obj = new practicearrays();
        System.out.println(obj.isSorted()); //! ALternate way iterate without using static 

        
    }
}

