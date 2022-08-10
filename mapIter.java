import java.util.*;
public class mapIter {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<>();
        mp.put(1, "Prajwal");
        mp.put(2, "Ayush");
        mp.put(3, "Vilas");
        mp.put(4, "Sunita");
        //* First Way */ 
        for(Map.Entry<Integer, String> m : mp.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
        //* Second Way it only gives the key */ 
        Set<Integer> keys = mp.keySet();
        // Set<Integer> values = mp.keySet();
        for(int key : keys){
            System.out.println(key);
        }
    }
}
