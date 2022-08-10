class Base{
    public int x;
    Base(){
        System.out.println("I am a constructor");
    }
    void setS(int x){
        this.x = x;
    }
    int getS(){
        return x;
    }
}

class Derived extends Base{
    public int y;
    Derived(){
        System.out.println("IN DERIVED CLASS");
        this.y = 0;
    }
    Derived(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
}


public class inheritence {
    public static void main(String[] args) {
        Base B = new Base();
        B.setS(10);
        System.out.println(B.getS());

        Derived D = new Derived();
        D = new Derived(23);
        System.out.println(D.getY());
        
    }
}
