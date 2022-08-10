import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(4,5);//* the first(4) will be an index and second argument(5) will be value provided
        // l1.size(); //* Gives the size 
        for(int i : l1){
            System.out.println(i);
        }
        System.out.println(l1.get(0)); //* to access the index.
        ArrayList<Integer> l2 = new ArrayList<>(5);//* The (5) here is an initial capacity of the array
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(4,4);
        // l1.addAll(l2); //* Add all function for adding arraylist to other arrayList(added at the end)
        
        l1.addAll(0,l2); //* Add all function for adding arraylist to other arrayList(specified index added at the beginning)
        // l1.clear(); //* it will deallocate the memory which was taken before
        l1.set(0, 666); //* Insert function (name of the index, value you want to insert)
        try{
            l2 = (ArrayList<Integer>)l1.clone();
        }
        catch(Exception e){
            System.out.println(e);
        }
        for(int i : l1) System.out.println(i);
        System.out.println(l1.contains(4)); // if present --> true else --> false
        System.out.println(l1.indexOf(4)); // will give the first index if present else -1
        System.out.println(l1.lastIndexOf(4)); // will give the last index if present else if first index else if not present -1
        System.out.println("_________________________");
        for(int i : l2) System.out.println(i);
        l2.trimToSize();// it will trim the array space to the size.
    }
}
