package WeekSwing;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Persona extends JPanel {
    public Persona() {
        setLayout(new GridLayout(0, 4, 10, 10)); // 0 rows (dynamic), 4 columns, 10px gaps
        setBackground(java.awt.Color.BLACK);

        // Character data
        String[] characterNames = {"Arsene", "Zorro", "Captain Kidd", "Carmen", "Goemon", "Johanna", "Necronomecon", "Milady", "Robin Hood", "Cendrillion", "Valjean", "Pandora", "Orpheus Telos", "Orpheus but manga", "Orpheus but real"};
        String[] imagePaths = {
            "Arsene.jpg", // Replace with actual image paths
            "Zorro.jpg",
            "Kidd.jpg",
            "Carmen.jpg",
            "Goemon.jpg",
            "Johanna.jpg",
            "Necronomicon.jpg",
            "Milady.jpg",
            "Robin.jpg",
            "Cendrillion.jpg",
            "Valjean.jpg",
            "Pandora.jpg",
            "Telos.jpg",
            "mangatelos.jpg",
            "idk.jpg"
        };

        // Add cards to the grid
        for (int i = 0; i < characterNames.length; i++) {
            final int index = i; // Create a final copy of i
            Card card = new Card(characterNames[index], imagePaths[index]);
            
            // Add a MouseListener to make the card interactable
            card.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Show a dialog with the image
                    ImageIcon icon = new ImageIcon(getClass().getResource("/" + imagePaths[index]));
                    JLabel imageLabel = new JLabel(icon);
                    JOptionPane.showMessageDialog(Persona.this, imageLabel, characterNames[index], JOptionPane.PLAIN_MESSAGE);
                }
            });

            // Create proper Border objects (LineBorder)
            card.addMouseListener(new Hover(Color.RED, Color.GRAY, 3)); // 3px thick

            add(card);
        }
    }
}


