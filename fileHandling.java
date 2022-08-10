import java.io.File;
// import java.io.FileReader;
// import java.util.Scanner;
// import java.io.FileWriter;
public class fileHandling {
    public static void main(String[] args) {
        // File myFile = new File("demo.txt");
        // try{
        //     //*Creating the new file of the name 'demo.txt'.
        //     myFile.createNewFile();
        // }
        // catch(Exception e){
        //     System.out.println("Unable to write in the file");
        //     e.printStackTrace();
        // }
        //* To write in file
        // try{
        //     FileWriter filewrite = new FileWriter("demo.txt");
        //     filewrite.write("This is an demo file for testing purpose file handling in Java\nHope this works ;)");
        //     filewrite.close();
        // }
        // catch(Exception e){
        //     System.out.println("Unable to write in the file");
        //     e.printStackTrace();
        // }
        // //*Reading into the file
        // File myFile = new File("demo2.txt");
        // try{
        //     Scanner input = new Scanner(myFile);
        //     while(input.hasNextLine()){
        //         String line = input.nextLine();
        //         System.out.println(line);
        //     }
        //     input.close();
        // }
        // catch(Exception e){
        //     System.out.println("Unable to read into the file");
        //     e.printStackTrace();
        // }
        //* Deleting a file
        File newFile = new File("demo3.txt");
        if(newFile.delete()){
            System.out.println("I have deleted the file " + newFile.getName());
        }else{
            System.out.println("Unable to delete the file");
        }
    }
}
