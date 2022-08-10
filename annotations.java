class Phone{
    public void speakPhone(){
        System.out.println("The phone is speaking");
    }
    public void silentMode(){
        System.out.println("The phone is on the silent mode");
    }
}
class newPhone extends Phone{
    @Override 
    public void speakPhone(){
        System.out.println("The new phone is speaking");
    }
    @Deprecated // To mark deprecated 
    public int add(int a, int b){
        return a + b;
    }
}
@FunctionalInterface //* according to this annotation each interface can have only one abstract class
interface myFunctionalInterface{
    void thisMethod();
    // void thisMethod2(); //! It will show an error
}
public class annotations {
    public static void main(String[] args) {
        // @SuppressWarnings("Deprecation") // To supress the errors
        newPhone p = new newPhone();
        p.speakPhone();
        System.out.println(p.add(1, 1));
    }
}
