import java.io.*;

public class CommandLineFileRead {
    public static void main(String[] args) {
        // Verify that the source file and destination file have been provided as command line arguments
        if (args.length < 2) {
            System.out.println("Please provide the source file and destination file as command line arguments.");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (
            // Open a FileInputStream and a FileOutputStream
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile)
        ) {
            int c;

            // Read the contents of the source file one byte at a time and write each byte to the destination file
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

