class Cylinder1{
    private double radius;
    private int height;
    private double area; 
    private double volume; 
    public void setHeight(int height){
        this.height = height;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public int getHeight(){
        return this.height;
    }
    public double getRadius(){
        return this.radius;
    }
    public double areaOfCylinder(){
        this.area = 2 * 3.14 * this.radius * (this.radius + this.height);
        return area;
    }
    public double volumeOfCylinder(){
        volume = (3.14 * this.radius * this.height);
        return volume;
    }
}
public class cylinder {
    public static void main(String[] args) {
        Cylinder1 c = new Cylinder1();
        c.setHeight(22);
        c.setRadius(12.1);
        System.out.println(c.areaOfCylinder()+ " " + c.volumeOfCylinder());

    }
}
