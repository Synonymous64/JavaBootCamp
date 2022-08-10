abstract class Base{ //* Need to use abstract keyword to create an abstract class
    public Base(){
        System.out.println("I am the constructor of Base");

    }
    public void sayHello(){
        System.out.println("Hello there!");
    }
    abstract public void greet(); //! Apne hisab se override krna hai aur jo argument dena hai de dena.
    abstract public void greet2(); //! Apne hisab se override krna hai aur jo argument dena hai de dena.
}

//! Either you have to declare the derived\the sub-class as abstract or you have to use all the abstract method from the superclass/abstract class through inheritance to make the concrete class/valid class.
class derived extends Base{
    @Override
    public void greet(){
        System.out.println("Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Afternoon");
    }
}
abstract class Derived2 extends Base{
    public void th(){
        System.out.println("Wassup");
    }
}
public class abstractclasses {
    public static void main(String[] args) {
        // Base b = new Base(); //! it won't work until and unless you initialise all the abstract methods
        derived d = new derived(); //! this will works since it's not an abstract class
        //! Like this you have to initialise methods in abstract class
        Derived2 d1 = new Derived2() {
            @Override
            public void greet() {
                System.out.println("P");
            }
            @Override
            public void greet2() {
                System.out.println("R");
            }
        };
            
    
    }
}
