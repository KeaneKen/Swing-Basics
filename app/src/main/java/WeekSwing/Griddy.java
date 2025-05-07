package WeekSwing;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Griddy extends JPanel {
    public Griddy() {
        setLayout(new GridLayout(0, 4, 10, 10)); // 0 rows (dynamic), 4 columns, 10px gaps
        setBackground(java.awt.Color.BLACK);

        //  character data
        String[] characterNames = {"Joker", "Morgana", "Ryuji", "Ann", "Yusuke", "Makoto", "Futaba", "Haru", "Akechi", "Kasumi","Zenkichi","Sophia","Kotone","Kotone but manga","Kotone but real"};
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
            add(new Card(characterNames[i], imagePaths[i]));
        }
    }
}
