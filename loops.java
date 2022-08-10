import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; ++i){
            arr[i] = sc.nextInt();
        }
        //! For each loop
        // for (int i : arr) {
        //     System.out.println(i);
        // }
        for (int i = arr.length - 1; i >= 0; --i){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
