class A{
    public int w = 2;
    protected int x = 3;
    private int y = 4;
    int z = 5;
    public int getY(int y){
        return this.y = y;
    } 
    public void getemALL(){
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
class B extends A{
    
}
class C{
    
}


public class accessModifiers{
    public static void main(String[] args) {
        System.out.println("This is about Access Modifiers");
        B b = new B();
        System.out.println(b.z);
    }
}
