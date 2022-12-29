import javax.swing.*;

public class JRadioButton1 {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("My Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a ButtonGroup to group the radio buttons together
        ButtonGroup buttonGroup = new ButtonGroup();

        // Create three radio buttons with different labels
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        // Add the radio buttons to the button group
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        // Create a JPanel to hold the radio buttons
        JPanel panel = new JPanel();
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        // Add the panel to the frame
        frame.add(panel);

        // Set the size and location of the frame
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
