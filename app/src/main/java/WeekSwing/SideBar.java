package WeekSwing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class SideBar extends JPanel {
    
    public SideBar(JSplitPane splitPane) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.DARK_GRAY);

        add(Box.createVerticalStrut(10));

        // Add buttons with ActionListeners
        addMenuItem("Home", splitPane);
        addMenuItem("Characters", splitPane);
        addMenuItem("Personas", splitPane);
        addMenuItem("Palaces", splitPane);
        addMenuItem("Tier List", splitPane);
        addMenuItem("Achievements", splitPane);
        addMenuItem("Best Teams", splitPane);
        addMenuItem("Social Links", splitPane);
    }

    private void addMenuItem(String text, JSplitPane splitPane) {
        MenuItem menuItem = new MenuItem(text);
        menuItem.addActionListener(new Listener(splitPane)); // Add ActionListener to the button

    menuItem.addMouseListener(new Hover(Color.RED, Color.GRAY, 3)); // 3px thick

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
