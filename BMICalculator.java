import java.util.*;

public class BMICalculator {
    double BMI, ht, wt;
    String name;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the Name:");
        name = sc.next();
        System.out.println("Enter the Height:");
        ht = sc.nextDouble();
        System.out.println("Enter the Weidth:");
        wt = sc.nextDouble();
    }

    void process() {
        BMI = wt / (ht * ht);
    }

    void output() {
        System.out.println("The BMI of " + name + " is = " + BMI);
    }

    public static void main(String[] args) {
        BMICalculator m1 = new BMICalculator();
        BMICalculator m2 = new BMICalculator();

        m1.input();
        m1.process();
        m1.output();

        m2.input();
        m2.process();
        m2.output();
    }
}