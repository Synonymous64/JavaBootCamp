import java.util.*;
public class employee {
    String empId;
    String name;
    double salary;
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee ID");
        empId = sc.nextLine();
        System.out.println("Enter the name of the employee");
        name = sc.nextLine();
        System.out.println("Enter the salary of the employee");
        salary = sc.nextDouble();
        sc.close();
    }
    public void getInfo(){
        System.out.println("The ID of the employee is" + empId);
        System.out.println("The salary of the employee is $" + salary);
        System.out.println("The name of the employee is " + name);
    }
    public static void main(String[] args) {
        employee s1 = new employee();
        employee s2 = new employee();
        employee s3 = new employee();
        employee s4 = new employee();
        employee s5 = new employee();
        s1.setInfo();
        s1.getInfo();
        s2.setInfo();
        s2.getInfo();
        s3.setInfo();
        s3.getInfo();
        s4.setInfo();
        s4.getInfo();
        s5.setInfo();
        s5.getInfo();
    }
}
