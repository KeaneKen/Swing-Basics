package WeekSwing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class CloseButton extends JButton {
    public CloseButton(String text) { // Fixed constructor name
        super(text); 
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(45, 40));
        setBackground(Color.RED);
        addActionListener(e -> System.exit(0)); // Close the application
    }
}