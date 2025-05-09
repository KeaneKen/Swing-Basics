package WeekSwing;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Hover extends MouseAdapter {
    private final Border hoverBorder;
    private final Border defaultBorder;

    // Constructor that takes Colors + thickness
    public Hover(Color hoverColor, Color defaultColor, int thickness) {
        this.hoverBorder = new LineBorder(hoverColor, thickness);
        this.defaultBorder = new LineBorder(defaultColor, thickness);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        ((JComponent) e.getSource()).setBorder(hoverBorder);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        ((JComponent) e.getSource()).setBorder(defaultBorder);
    }
}