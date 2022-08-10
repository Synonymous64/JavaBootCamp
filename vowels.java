import java.util.*;
public class vowels {

    public void findVowels(String s){
        int[] arr = new int[26];
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }
        System.out.println("The value of Vowels are as follows\na = " + arr['a' - 'a'] + "\ne = " + arr['e' - 'a'] + "\ni = " + arr['i' - 'a'] + "\no = " + arr['o' - 'a'] + "\nu = " + arr['u' - 'a']);
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
