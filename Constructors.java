class Sample{
    //* Parameterized Contructor */ 
    public int a , b;
    Sample(int a, int b){
        System.out.println("Parameterized constructor is called");
        System.out.println("added a + b = " + (a + b));
    }
}
public class Constructors {
    public static void main(String[] args) {
        Sample s = new Sample(10, 10);
    }
}
