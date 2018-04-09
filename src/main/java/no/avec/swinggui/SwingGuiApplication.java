package no.avec.swinggui;

import no.avec.swinggui.gui.MainController;
import no.avec.swinggui.gui.SplashScreen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import javax.swing.*;

@SpringBootApplication
public class SwingGuiApplication implements CommandLineRunner, ApplicationListener<ApplicationReadyEvent> {

	private static Logger log = LoggerFactory.getLogger(SwingGuiApplication.class);

    private static SplashScreen splash;
//    private static MainController main;
    private static ApplicationContext ctx;

	public static void main(String[] args) throws Exception {
		log.debug("1");
		UIManager.setLookAndFeel(
//				UIManager.getCrossPlatformLookAndFeelClassName());
				UIManager.getSystemLookAndFeelClassName());

        // Ensure EDT
		SwingUtilities.invokeAndWait(() -> {
			log.debug("2");
			splash = new SplashScreen();
			splash.setVisible(true);
		});

		// Start Spring container
        ctx = new SpringApplicationBuilder(SwingGuiApplication.class)
//                .bannerMode(Banner.Mode.OFF)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);

	}

	@Override
	public void run(String... args) throws Exception {
		log.debug("3");
        // Do something with the args if they are there
		System.out.println("inside run");

	}

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {

		log.debug("4");
		// Nå er Containeren klar
        System.out.println("Container ready. Displaying view.");

        // Ensure EDT
		SwingUtilities.invokeLater(() -> {
			log.debug("5");
            MainController main = ctx.getBean(MainController.class);
			splash.dispose();
			main.showView();
		});
	}
}