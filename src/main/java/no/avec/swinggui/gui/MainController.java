package no.avec.swinggui.gui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.event.ActionEvent;

/**
 * Created by avec on 22/03/2018.
 */
@Component
public class MainController extends AbstractController {
    private static Logger log = LoggerFactory.getLogger(MainController.class);

    private MainView view;

    @Autowired
    public MainController(MainView view) {
        log.debug("1");
        this.view = view;
    }

    public void showView() {
        log.debug("2");
        registerActions();
        view.setVisible(true);
    }

    @Override
    public View getView() {
        return null;
    }

    @Override
    public void registerActions() {
        log.debug("3");
        registerAction(view.getMagicButton(), e ->
            System.out.println("You clicked button " + e.getActionCommand())
        );
    }
}
