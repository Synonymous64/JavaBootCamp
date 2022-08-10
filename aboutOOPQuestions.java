// class Employee{
//     double salary;
//     String name;
//     public void setSalary(double salary){
//         this.salary = salary;
//     }
//     public void setName(String name){
//         this.name = name;
//     }
//     public double getSalary(){
//         return this.salary;
//     }
//     public String getName(){
//         return this.name;
//     }
// }

class Square{
    double side;
    public void forArea(double side){
        this.side = Math.pow(side, 2);
    }
    public void forParameter(double size){
        this.side = 4 * size;
    }
}

public class aboutOOPQuestions {
    public static void main(String[] args) {
        // Employee Prajwal = new Employee();
        // Prajwal.setName("Prajwa");
        // Prajwal.setSalary(123454.44);
        // System.out.println(Prajwal.getName());
        // System.out.println(Prajwal.getSalary());
    }
}
