import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Depricated{
    @Deprecated
    public void depmeth(){
        System.out.println("This is a depricated method");
    }
}
@FunctionalInterface
interface Myinterface{
    public void myMethod();
}
public class practiceset {
    public static void main(String[] args) {
        // @SuppressWarnings("Deprecation")
        // Depricated d = new Depricated();
        // d.depmeth();
        // Myinterface p = new Myinterface() {
        //     @Override
        //     public void myMethod(){
        //         System.out.println("This is my method");
        //     }
        // };
        // p.myMethod();
        String a = "";
        File myFile = new File("table.txt");
        int p = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the table you want to add into the file");
        p = input.nextInt();
        for(int i = 1; i <= 10; ++i){
            a += p + "*" + i + " " + " = " + p * i;
            a+="\n";
        }
        
        try{
            myFile.createNewFile();
            FileWriter fileWrite = new FileWriter("table.txt");
            fileWrite.write(a);
            fileWrite.close();
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            
            sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        input.close();
    }
}
