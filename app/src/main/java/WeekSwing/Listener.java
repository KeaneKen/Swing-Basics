package WeekSwing;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

public class Listener implements java.awt.event.ActionListener {

    private JSplitPane splitPane;
    private JPanel newPanel;

    // Constructor to initialize the splitPane
    public Listener(JSplitPane splitPane) {
        this.splitPane = splitPane;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        // Check if the event source is a button
        if (e.getSource() instanceof javax.swing.JButton) {
            javax.swing.JButton button = (javax.swing.JButton) e.getSource();
            String buttonText = button.getText();

            // Create a new panel based on the button text
            switch (buttonText) {
                case "Characters":
                    newPanel = new Griddy();
                    break;
                case "Personas":
                    newPanel = new Persona();
                    break;
                default:
                    return; // Unknown button, do nothing
            }

            // Update the split pane with the new panel
            JScrollPane scrollPane = new JScrollPane(newPanel);
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.getVerticalScrollBar().setUnitIncrement(17);
            splitPane.setDividerLocation(240);
            splitPane.setRightComponent(scrollPane);
        }
    }
}
