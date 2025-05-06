package WeekSwing;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class SideBar extends JPanel {

    public SideBar() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(Color.DARK_GRAY);

        add(Box.createVerticalStrut(10));
        //Home
        add (new MenuItem("Home"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Character
        add (new MenuItem("Characters"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Personas
        add (new MenuItem("Personas"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Palaces
        add (new MenuItem("Palaces"));

        add(Box.createVerticalStrut(10)); // 10 pixels of vertical space

        //Tierlist
        add (new MenuItem("Tier List"));

    
        
}
}