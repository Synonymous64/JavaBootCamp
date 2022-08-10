class A{
    public void meth2(){
        System.out.println("This is a method two from class A");
    }
    public int meth(){
        return 4;
    }
}
class B extends A{
    @Override                   //*  This will tell the user if the method is override or not
    public void meth2(){
        System.out.println("This is a method two from class B");
    }
    public void meth3(){
        System.out.println("This is a method three from class B");
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
