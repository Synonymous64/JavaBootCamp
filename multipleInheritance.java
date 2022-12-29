// How multiple inheritance is implemented in java, give suitable examples
interface Colored{
    String getColor();
}
interface Shape{
    String getShape();
}
public class multipleInheritance implements Colored, Shape{
    private String color, shape;
    public multipleInheritance(String color, String shape){
        this.color = color;
        this.shape = shape;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public String getShape(){
        return this.shape;
    }
    public static void main(String[] args) {
        multipleInheritance m = new multipleInheritance("purple", "sphere");
        System.out.println(m.getColor());
        System.out.println(m.getShape());
    }
}