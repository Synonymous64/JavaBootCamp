import java.util.Scanner;
public class Distance {
    int km;
    float m;

    void setdata(int a, float b) {
        km = a;
        m = b;
    }

    void display() {
        System.out.println(km + "\t" + m + "\t");
    }

    void addition(Distance t1, Distance t2) {
        km = t1.km + t2.km;
        m = t1.m + t2.m;
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        Distance d3 = new Distance();
        Scanner input = new Scanner(System.in);
        int a = 0;
        float b = 0;
        
        //* input for object d2 */
        System.out.println("Enter the values for object 'd1'");
        a = input.nextInt();
        b = input.nextFloat();
        d1.setdata(a, b);
        d1.display();

        //* input for object d2 */
        System.out.println("Enter the values for object 'd2'");
        a = input.nextInt();
        b = input.nextFloat();
        d2.setdata(a, b);
        d2.display();

        //*Printing result from object d3 */
        d3.addition(d1, d2);
        d3.display();
        input.close();
    }
}