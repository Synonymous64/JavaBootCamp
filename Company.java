import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Person{
    private String name;
    private int age;
    public void acceptPerson() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name of the person");
        this.name = (String)input.readLine();
        System.out.println("Enter the age of the person");
        this.age = Integer.parseInt(input.readLine());
    }
    public void displayPerson(){
        System.out.println("The name of the person is " + this.name);
        System.out.println("The age of the person is " + this.age);
    }
}
interface Employee{
    int impId = 007;
    double impSalary = 12000.91;
    void displayEmployee();
}
public class Company extends Person implements Employee {
    @Override
    public void displayEmployee(){
        System.out.println("The Employee ID is " + Employee.impId);
        System.out.println("The Employee Salary is ₹" + Employee.impSalary);
    }
    private int companyId;
    private String companyName;
    private String productName;
    public void acceptCompany() throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the ID of the company");
        companyId = Integer.parseInt(input.readLine());
        System.out.println("Enter the name of the company");
        companyName = (String)input.readLine();
        System.out.println("Enter the name of the product");
        productName = (String)input.readLine();
    }
    public void displayCompany(){
        System.out.println("The ID of the company is " + this.companyId);
        System.out.println("The name of the company is " + this.companyName);
        System.out.println("The name of the product is " + this.productName);
    }
    public static void main(String[] args) {
        Company s = new Company();
        try{
            s.acceptPerson();
            s.acceptCompany();
            s.displayPerson();
            s.displayEmployee();
            s.displayCompany();
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("Program Successfully executed :)");
        }
    }
}
