
class employee {
    int id;
    String name;
    public void printDetails(){
        System.out.println("The Employee ID is - :" + id);
        System.out.println("The Employee name is - :" + name);
    }
    public void setDetails(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class customclass {
    public static void main(String[] args) {
        employee Prajwal = new employee();  //! Instantiating the new Employee object
        // setting the properties// attributes
        Prajwal.id = 12;
        Prajwal.name = "Prajwal";
        System.out.println(Prajwal.id);
        System.out.println(Prajwal.name);
        Prajwal.setDetails(89, "Prajwall");
        Prajwal.printDetails();
    }
}
