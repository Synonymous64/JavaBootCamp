import java.util.Scanner;
public class multidimensionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr= new int[2][2];
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr.length; ++j){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr.length; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
}
