import javax.swing.*;
public class JTxtField1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text-Field");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20); // creates a text field with a width of 20 characters
        frame.add(textField);
        textField.setText("Enter text here"); // sets the default text for the text field
        textField.setEditable(true); // allows the user to edit the text in the field
        frame.setVisible(true);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);

    }
}
