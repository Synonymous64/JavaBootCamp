import java.io.*;
import java.util.*;

public class javafileHandling {
    public void fileCreation() {
        try {
            File myPraj = new File("temp.txt");
            myPraj.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void fileWriting() {
        try {
            FileWriter fileWrite = new FileWriter("temp.txt");
            fileWrite.write("This is Prajwal:)");
            fileWrite.flush();
            fileWrite.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fileReading() {
        try {
            String str = "";
            FileReader fileRead = new FileReader("temp.txt");
            Scanner sc = new Scanner(fileRead);
            while (sc.hasNextLine()) {
                str += sc.nextLine();
            }
            System.out.println(str);
            fileRead.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        javafileHandling p = new javafileHandling();
        p.fileCreation();
        p.fileWriting();
        p.fileReading();
    }
}
