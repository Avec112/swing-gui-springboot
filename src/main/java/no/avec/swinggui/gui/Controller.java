package no.avec.swinggui.gui;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Created by avec on 23/03/2018.
 */
public interface Controller {

    View getView();

    void registerAction(JButton button, ActionListener listener);

    void registerActions();
}
