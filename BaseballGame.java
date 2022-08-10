import java.util.Vector;

class Solution {
    public int calPoints(String[] ops) {
        Vector<Integer> operate = new Vector<>(); 
        int res = 0;
        int size = 0;
        for(String ch : ops){
            if(ch.equals("+")){
                operate.add(operate.elementAt(size - 1) + operate.elementAt(size - 2));
                size++;
            } else if(ch.equals("D")){
                operate.add(operate.elementAt(size - 1) * 2);
                size++;
            } else if(ch.equals("C")){
                operate.remove(size - 1);
                size--;
            }
            else {
                operate.add(Integer.parseInt(ch));
                size++;
            }
        }
        for(int i = 0; i < operate.size(); ++i){
            res += operate.elementAt(i);
        }
        return res;
    }
}


public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        Solution s = new Solution();
        System.out.println(s.calPoints(ops));        
    }
}
