import javax.swing.*;

public class JButton1 {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("My Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton with the text "Click me!"
        JButton button = new JButton("Click me!");
        // Add an action listener to the button
        button.addActionListener(e -> {
            // Do something when the button is clicked
            System.out.println("Button clicked!");
        });

        // Add the button to the frame
        frame.add(button);

        // Set the size and location of the frame
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
