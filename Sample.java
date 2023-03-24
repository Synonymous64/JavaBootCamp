import java.util.*;

@FunctionalInterface
interface company {
    public void Name_of_the_company();
}

class Person {
    public String DOB;
    public long Mobile_No;
}

class employee extends Person {
    public String Name;
    public String Designation;
}

public class Sample extends employee implements company {
    public String companyName;

    public void setInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        Name = sc.nextLine();
        System.out.println("Designation");
        Designation = sc.nextLine();
        System.out.println("Enter DOB");
        DOB = sc.nextLine();
        System.out.println("Enter Mobile Number");
        Mobile_No = sc.nextLong();
        System.out.println("Enter Name of the company");
        sc.nextLine();
        companyName = sc.nextLine();
        sc.close();
    }

    public void getInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Designation: " + Designation);
        System.out.println("DOB: " + DOB);
        System.out.println("Mobile No.: " + Mobile_No);
    }

    @Override
    public void Name_of_the_company() {
        System.out.println("Name of Company: " + companyName);
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        s.setInfo();
        s.getInfo();
        s.Name_of_the_company();
    }
}

/*
 * output:
 * Enter name
 * Praj
 * Designation
 * Developer
 * Enter DOB
 * 26 May 2022
 * Enter Mobile Number
 * 9503586791
 * Enter Name of the company
 * Amazon
 * Name: Praj
 * Designation: Developer
 * DOB: 26 May 2022
 * Mobile No.: 9503586791
 * Name of Company: Amazon
 */