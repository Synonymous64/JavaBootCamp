class Sample{
    //* Default Contructor */ 
    public int a , b;
    Sample(){
        System.out.println("Default constructor is called");
        a = b = 10;
        System.out.println("added a + b = " + (a + b));
    }
}
public class Constructors {
    public static void main(String[] args) {
        Sample s = new Sample();
    }
}