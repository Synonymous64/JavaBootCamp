public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int open = 0, close = 0, maxLength = 0;
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; ++i){
            if(ch[i] == '(') open++;
            else close++;
            if(close == open) maxLength = Math.max(maxLength, 2 * close);
            else if(close >= open) close = open = 0;
        }
        close = open = 0;
        for(int i = ch.length - 1; i >=0; --i){
            if(ch[i] == '(') open++;
            else close++;
            if(open == close) maxLength = Math.max(maxLength, 2 *open);
            else if(open >= close) close = open = 0;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestValidParentheses s = new LongestValidParentheses();
        String str = "(()";
        System.out.println(s.longestValidParentheses(str));        
    }
}
