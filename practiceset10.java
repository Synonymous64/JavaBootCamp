class Circle{
    protected float radius;
    protected void setRadius(int radius){
        this.radius = radius;
    }
    protected double areaOfCircle(){
        return (3.14 * (this.radius * this.radius));
    } 
    protected double circumferenceofCircle(){
        return 2 * (3.14 * this.radius);
    }
    Circle(){
        this.radius = 0;
    }
}
class Cylinder extends Circle{
    private float height;
    protected void setHeight(float height){
        this.height = height;
    }
    protected double areaOfCylinder(){
        
        return (2 * 3.14 * this.radius) * (this.radius + height);
    }
    protected double volumeOfCylinder(){
        return ((3.14) * (this.radius * this.radius) * height);
    }

}
class Cuboid{
    protected float length;
    protected float breadth;
    protected float width;
    protected void setLength(float length){
        this.length = length;
    }
    protected void setbreadth(float breadth){
        this.breadth = breadth;
    }
    protected void setWidth(float width){
        this.width = width;
    }
    protected float areaofCuboid(){
        return 2 * (this.length * this.breadth);
    }
    protected float volumeofCuboid(){
        return (this.length * this.breadth * this.width);
    }
}
class Rectangle extends Cuboid{
    protected float areaOfRectangle(){
        return (this.length * this.width);
    }
    protected float volumeofRectangle(){
        return (this.length * this.breadth * this.width);
    }
}
public class practiceset10 {
    public static void main(String[] args) {
        Cylinder cp = new Cylinder();
        cp.radius = (float)3.13;
        cp.setHeight((float)23.1);
        System.out.format( "%.2f\n", cp.areaOfCircle());
        System.out.format("%.2f\n", cp.areaOfCylinder());
        System.out.format("%.2f\n", cp.circumferenceofCircle());
        System.out.format("%.2f\n", cp.volumeOfCylinder());
        Rectangle rc = new Rectangle();
        rc.setLength(12.1f);
        rc.setbreadth(13.1f);
        rc.setWidth(14.f);
        System.out.format("%.2f\n", rc.areaOfRectangle());
        System.out.format("%.2f\n", rc.volumeofRectangle());
        System.out.format("%.2f\n", rc.areaofCuboid());
        System.out.format("%.2f\n", rc.volumeofCuboid());
    }
}
