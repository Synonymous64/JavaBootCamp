
class myClass{
    int a;
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return this.a;
    }
    myClass(int a){
        System.out.println(this.a = a);
    }
    myClass(){
        this.a = 0;
    }
}
class myDerived extends myClass{
    myDerived(int a){
        super(23);
        System.out.println("Derived Constructor called");
    }
}

public class superandthis {
    public static void main(String[] args) {
        myClass obj = new myClass();
        myDerived obj1 = new myDerived(25);
        obj.a = 1;
        obj1.a = 3;

        
        
    }
}
