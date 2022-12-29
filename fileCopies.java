import java.io.*;
import java.util.Scanner;

public class fileCopies {
    private String originalTxt;

    public void OriginaFile() {
        try {
            File originalFile = new File("originalFile.txt");
            originalFile.createNewFile();
            FileWriter originalFileWriter = new FileWriter("originalFile.txt");
            Scanner sc = new Scanner(System.in);
            originalTxt = sc.nextLine();
            originalFileWriter.write(originalTxt);
            originalFileWriter.close();
            sc.close();
            sc = new Scanner(originalFile);
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                System.out.println(str);
            }
            sc.close();
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public void tempFile() {
        try {
            File tempFile = new File("tempFile.txt");
            tempFile.createNewFile();
            FileWriter tempFileWriter = new FileWriter(tempFile);
            tempFileWriter.write(originalTxt);
            tempFileWriter.close();

        } catch (Exception x) {
            x.printStackTrace();
        }
    }

    public static void main(String[] args) {
        fileCopies p = new fileCopies();
        p.OriginaFile();
        p.tempFile();
    }
}
