//! This is called SuperClass
class Phone{
    public void greet(){
        System.out.println("Morning mate!");
    }
    public void name(){
        System.out.println("This is Java of Class Phone");
    }
    public void On(){
        System.out.println("The phone is turning on");
    }
}
//! This is called SubClass
class SmartPhone extends Phone{
    @Override
    public void name(){
        System.out.println("This is Java of Class SmartPhone");
    }
    public void songs(){
        System.out.println("Song Played");
    }
    @Override
    public void On(){
        System.out.println("The smartPhone is turning on");
    }
}
public class dynamicDispatch{
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // SmartPhone samsung = new SmartPhone();
        // obj.name();
        //! Dynamic Dispatch
        Phone obj = new SmartPhone();
        //! The reference of superclass can be equal to subclass.
        //! But the reference of subclass can't be equal to superclass.
        // SmartPhone obj2 = new Phone(); //! Not Posssible 
        //! Run Time polymorphism --> Creation of object during run-time.
        obj.greet();
        obj.name(); //! if we do memory dispatch the method will always be called off from superclass during method overiding
        obj.On();   //! --> SAME APPLICATION <--
    }
    //! Thus Dynamic DisPatch --> The objects are getting created during the run-time.
}