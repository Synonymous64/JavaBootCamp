import java.util.*;

public class CheckIfaStringContainsAllBinaryCodesofSizeK {
    public boolean hasAllCodes(String s, int k) {
        if(s.length() < k) return false;
        Set<String> mySet = new HashSet<String>();
        for(int i = 0; i <= s.length() - k; ++i){
            mySet.add(s.substring(i , i + k));
        }
        if(mySet.size() == Math.pow(2, k)) return true;
        else return false;
    }
    public static void main(String[] args) {
        String s = "00110110";
        int  k = 2;
        CheckIfaStringContainsAllBinaryCodesofSizeK p = new CheckIfaStringContainsAllBinaryCodesofSizeK();
        System.out.println(p.hasAllCodes(s, k));
    }
}
