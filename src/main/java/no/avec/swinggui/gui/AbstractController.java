package no.avec.swinggui.gui;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by avec on 23/03/2018.
 */
public abstract class AbstractController implements Controller {

    public void registerAction(JButton button, ActionListener listener) {
        button.addActionListener(listener);
    }

}
