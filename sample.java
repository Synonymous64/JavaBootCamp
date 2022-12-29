
// package con.sample1;
import java.util.*;

public class sample {
    String modify(String s1) {
        if (s1.equals("java"))
            return "tava";
        return s1;
    }

    public static void main(String[] args) {
        String s1, s2;
        sample s = new sample();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1:");
        s1 = input.nextLine();
        System.out.println("Enter string 2:");
        s2 = input.nextLine();
        if (s1.equals(s2))
            System.out.println("Equal String");
        else
            System.out.println("Unequal String");
        System.out.println(s.modify(s1));
        input.close();
    }
}
