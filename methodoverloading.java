public class methodoverloading {

    public static void greet(String name){
        System.out.println("Good Morning " + name);
    }
    public static void greet(){
        System.out.println("Good Morning Prajwal");
    }
    public static void main(String[] args) {
        greet("Ayush");
        greet();
    }
}
