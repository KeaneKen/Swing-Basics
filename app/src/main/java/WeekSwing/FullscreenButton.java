package WeekSwing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FullscreenButton extends JButton {
    private boolean isFullscreen = false; // Track fullscreen state
    private final JFrame frame;

    public FullscreenButton(String text, JFrame frame) { // Pass the JFrame to control
        super(text);
        this.frame = frame;
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(45, 40));
        setBackground(Color.RED);

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isFullscreen) {
                    frame.dispose();
                    frame.setUndecorated(false);
                    frame.setExtendedState(JFrame.NORMAL);
                    frame.setVisible(true);
                } else {
                    frame.dispose();
                    frame.setUndecorated(true);
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                }
                isFullscreen = !isFullscreen; // Toggle state
            }
        });
    }
}