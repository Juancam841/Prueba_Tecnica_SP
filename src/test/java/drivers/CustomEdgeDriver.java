package drivers;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomEdgeDriver implements DriverSource {
    static {
        // Set up logging
        System.setProperty("webdriver.edge.silentOutput", "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);

        // Set the path to the Edge WebDriver
        String driverPath = System.getProperty("user.dir") + "\\\\drivers\\\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", driverPath);
        System.out.println("Ruta del EdgeDriver: " + driverPath);
    }

    @Override
    public WebDriver newDriver() {
        try {
            // Basic Edge options
            EdgeOptions options = new EdgeOptions();

            // Basic configuration
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");

            // Disable automation detection
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            options.setExperimentalOption("useAutomationExtension", false);

            // Disable password manager and autofill
            options.addArguments("--disable-password-manager");
            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--disable-single-click-autofill");
            options.addArguments("--disable-autofill-keyboard-accessory");

            // Use InPrivate mode
            options.addArguments("-inprivate");

            // Disable extensions
            options.addArguments("--disable-extensions");

            System.out.println(">>> Inicializando CustomEdgeDriver <<<");

            return new EdgeDriver(options);

        } catch (Exception e) {
            System.err.println("Error al inicializar el WebDriver: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("No se pudo inicializar el WebDriver de Edge: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}
