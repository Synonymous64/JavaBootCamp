import java.util.ArrayDeque;

public class arrayDqueue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(1);
        ad.add(2);
        ad.add(3);
        ad.add(4);
        ad.add(5);
        ad.add(6);
        for(int i : ad){
            System.out.println(i);
        }
        System.out.println(ad.getLast()); //* Gives the last element
        System.out.println(ad.getFirst());//*Gives the first element
    }
}
