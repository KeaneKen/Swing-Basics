package WeekSwing;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class ListenerButton implements ActionListener {
    private final String url;

    public ListenerButton(String url) {
        this.url = url;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI(url));
            } else {
                System.err.println("Desktop is not supported on this platform.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
