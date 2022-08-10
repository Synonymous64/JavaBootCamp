public class PalindromicSubstrings {
    private int countFunct(int start, int end, char[] ch){
        int count = 0;
        while(start >= 0 && end < ch.length && ch[start--] == ch[end++]) count++;
        return count;
    }
    public int countSubstrings(String s) {
        int n = s.length(), res = 0;
        char [] ch = s.toCharArray();
        for(int i = 0; i < n; ++i){
            res += countFunct(i,i,ch);
            res += countFunct(i,i + 1,ch);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abc";
        PalindromicSubstrings p = new PalindromicSubstrings();
        System.out.println(p.countSubstrings(s));
        
    }
}
