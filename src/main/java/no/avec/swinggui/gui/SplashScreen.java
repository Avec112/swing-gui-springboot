package no.avec.swinggui.gui;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.awt.*;
import java.lang.invoke.MethodHandles;

/**
 * SplashScreen is a swing application on its own.
 *
 * Created by avec on 22/03/2018.
 */
public class SplashScreen extends AbstractView {

    private static Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private JFrame frame;

    public SplashScreen() {
        log.debug("1 - inside AWT");
        // super calls createView here
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.add(this);
        frame.setSize(300, 80);
        frame.setLocationRelativeTo(null); // center frame
    }

    @Override
    public void createView() {
        log.debug("2 - inside AWT");
        setLayout(new BorderLayout());
        add(new JPanel().add(new JLabel("Splash", SwingConstants.CENTER)), BorderLayout.CENTER); // empty
        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true);
        add(progressBar, BorderLayout.SOUTH);
    }

    public void setVisible(boolean visible) {
        log.debug("3 - inside AWT");
        frame.setVisible(visible);
    }

    public void dispose() {
        log.debug("4 - inside AWT");
        frame.dispose();
    }
}
