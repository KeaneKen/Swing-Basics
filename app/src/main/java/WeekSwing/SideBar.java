package WeekSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SideBar extends JPanel {
    
    public SideBar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.DARK_GRAY);

        add(Box.createVerticalStrut(10));

        // Add buttons with ActionListeners
        addMenuItem("Home");
        addMenuItem("Characters");
        addMenuItem("Personas");
        addMenuItem("Palaces");
        addMenuItem("Tier List");
        addMenuItem("Achievements");
        addMenuItem("Best Teams");
        addMenuItem("Social Links");
    }

    private void addMenuItem(String text) {
        MenuItem menuItem = new MenuItem(text);

        // Add a MouseListener to handle hover effects
        menuItem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change appearance when hovered
                menuItem.setBackground(Color.LIGHT_GRAY);
                menuItem.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Revert appearance when hover ends
                menuItem.setBackground(Color.GRAY);
                menuItem.setForeground(Color.WHITE);
            }
        });

        // Add an ActionListener for button clicks
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle button click
                System.out.println("Button clicked: " + text);
            }
        });

        add(menuItem);
        add(Box.createVerticalStrut(10)); // Add spacing
    }
}
