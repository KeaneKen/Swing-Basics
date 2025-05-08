package WeekSwing;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Griddy extends JPanel {
    public Griddy() {
        setLayout(new GridLayout(0, 4, 10, 10)); // 0 rows (dynamic), 4 columns, 10px gaps
        setBackground(java.awt.Color.BLACK);

        // Character data
        String[] characterNames = {"Joker", "Morgana", "Ryuji", "Ann", "Yusuke", "Makoto", "Futaba", "Haru", "Akechi", "Kasumi", "Zenkichi", "Sophia", "Kotone", "Kotone but manga", "Kotone but real"};
        String[] imagePaths = {
            "Joker.jpg", // Replace with actual image paths
            "Morgana.jpg",
            "Ryuji.jpg",
            "Ann.jpg",
            "Yusuke.jpg",
            "Makoto.jpg",
            "Futaba.jpg",
            "Haru.jpg",
            "Akechi.jpg",
            "Kasumi.jpg",
            "Zenkichi.jpg",
            "Sohpia.jpg",
            "Kotone.jpg",
            "Kotone_manga.jpg",
            "Kotone_live.jpg"
        };

        // Add cards to the grid
        for (int i = 0; i < characterNames.length; i++) {
            final int index = i; // Create a final copy of i
            Card card = new Card(characterNames[index], imagePaths[index]);
            
            // Add a MouseListener to make the card interactable
            card.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    // Show a dialog or perform an action when the card is clicked
                    JOptionPane.showMessageDialog(Griddy.this, "You clicked on: " + characterNames[index]);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    // Change appearance when hovered
                    card.setForeground(Color.WHITE);
                    card.setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED, 2));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    // Revert appearance when hover ends
                    card.setForeground(Color.LIGHT_GRAY);
                    card.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                }
            });

            add(card);
        }
    }
}
