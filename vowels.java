import java.util.*;
public class vowels {

    public void findVowels(String s){
        int[] arr = new int[256];
        for(char ch : s.toCharArray()){
            arr[ch - '0']++;
        }
        System.out.println("The value of Vowels are as follows\na = " + arr['a' - '0'] + "\ne = " + arr['e' - '0'] + "\ni = " + arr['i' - '0'] + "\no = " + arr['o' - '0'] + "\nu = " + arr['u' - '0']);
    }
    public static void main(String[] args) {
        vowels v = new vowels();
        System.out.println("Enter the String");
        Scanner input = new Scanner(System.in);
        String s = "";
        s = input.nextLine();
        v.findVowels(s);
        input.close();
    }
}
