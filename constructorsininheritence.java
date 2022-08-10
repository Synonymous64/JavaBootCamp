class Base{
    public int x;
    Base(){
        System.out.println("I am a constructor of base");
    }
    Base(int a){
        System.out.println("I am a constructor of base with " + a);
    }
    Base(int a, int b){
        System.out.println("I am a constructor of base with " + a + " " + b);
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(int x){
        return this.x;
    }
}
class Derived extends Base{
    public int y;
    
    Derived(){
        super(34, 45); //! this will print the overloaded constructors of arguments. 
        //! depending upon the arguments it will call the constructor of base class.
        System.out.println("I am a constructor of derived");
    }
    Derived(int a, int b){
        super(34); //! this will print the overloaded constructors of arguments. 
        System.out.println("I am a constructor of Derived with " + a + " " + b);
    }
    Derived(int a, int b, int c){
        super(34); //! this will print the overloaded constructors of arguments. 
        System.out.println("I am a constructor of Derived with " + a + " " + b + " " + c);
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
}
class childDerived extends Derived{
    childDerived(){
        System.out.println("I am the child derived constructor");
    }
    childDerived(int a, int b, int c){
        super(1,2,3);
        System.out.println("I am the child derived constructor " + a + " " + b + " " + c);
    }

}
public class constructorsininheritence {
    public static void main(String[] args) {
        // Base b = new Base();

        
        // Derived c = new Derived(2,3);
        childDerived d = new childDerived(4,5,6);
        d.x = 1;
        
    }
}
