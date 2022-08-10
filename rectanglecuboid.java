class Rectangle{
    int l;
    int b;
    int w;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
        System.out.println("This is a parametrized constructor of superclass.");
    }
    public int Area(){
        return l*b;
    }

}
class Cuboid extends Rectangle
{
    Cuboid(int l,int b,int w)
    {
        super(l,b);
        this.w=w;
        System.out.println("This is a parametrized constructor of subclass.");
    }
    public int Area()
    {
        System.out.println(super.Area());
        return 2*l*w+2*l*b+2*b*w;
    }
 }
public class rectanglecuboid {
    public static void main(String[] args) {
        Cuboid c=new Cuboid(2,4,6);
        System.out.println(c.Area());
    }
    
}