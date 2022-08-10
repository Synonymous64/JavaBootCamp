public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        int i = 0;
        StringBuffer str = new StringBuffer(s);
        while(i < s.length()){
            if(s.charAt(i) == '#'){
                if(i == 0) str.delete(i,1);
                else{
                    str.delete(i - 1, 2);
                    i--;
                }
            }
            else i++;
        }
        i = 0;
        StringBuffer str2 = new StringBuffer(t);
        while(i < t.length()){
            if(t.charAt(i) == '#'){
                if(i == 0) str2.delete(i, 1);
                else{
                    str2.delete(i - 1, 2);
                    i--;
                }
            }
            else i++;
        }
        if(str.equals(str2)) return true;
        return false;
    }
    
    public static void main(String[] args) {
        String s = "a##c", t = "#a#c";
        BackspaceStringCompare p = new BackspaceStringCompare();
        System.out.println(p.backspaceCompare(s, t));
    }
}
