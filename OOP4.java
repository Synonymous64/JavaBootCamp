import java.util.Scanner;
class OOP4 {
    double radi;
    Scanner sc=new Scanner(System.in);
    void inputDimension(){
        System.out.println("Enter the radius:");
        radi=sc.nextDouble();
    }
    void CalculateArea(){
        double area=3.14*radi*radi;
        System.out.println("The Area of circle is:"+area);
    }
    void CalculateCircumference(){
        double cir=2*3.14*radi;
        System.out.println("The Circumference of circle is:"+cir);
    }
    public static void main(String[]args)
    {
        OOP4 cr = new OOP4();
        cr.inputDimension();
        cr.CalculateArea();
        cr. CalculateCircumference();
    }

}