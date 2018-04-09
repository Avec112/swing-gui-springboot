package no.avec.swinggui.gui;

import no.avec.swinggui.repository.entity.MyEntity;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by avec on 23/03/2018.
 */
@Component
public class MainView extends JFrame implements View {

    private JButton button;

    public MainView() throws HeadlessException {
        createView();
    }

    @Override
    public void createView() {

        setTitle("My App v0.0.1");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        JLabel label = new JLabel("Hello");
        panel.add(label);
        button = new JButton("magic");
        panel.add(button);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
    }

    public JButton getMagicButton() {
        return button;
    }

}
