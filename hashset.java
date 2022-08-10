import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(12,5.1f); //Capacity and loadfactor in float
        h.add(5);
        h.add(52);
        h.add(51);
        h.add(56);
        h.add(55);
        System.out.println(h); //* such traversal or printing is possible
        for(int i : h){
            System.out.print(i + " ");
        }
    }
}
