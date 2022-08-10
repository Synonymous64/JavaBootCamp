import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(4,5);
        l1.addLast(6);// *It will add the element on last index into the list.
        l1.addFirst(0); //* It will add the element on first index into the list.
        // for(int i = 0; i < l1.size(); ++i) System.out.println(l1.get(i));
        System.out.println(l1.offer(9)); // Adds the element in last but as a tail of the Linkedlist
        LinkedList<Integer> l2 = new LinkedList<>();
        l2 = (LinkedList<Integer>)l1.clone();
        for(int i : l1) System.out.println(i);
        for(int i : l2) System.out.println(i);
    }
}
