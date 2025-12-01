package runners;

import io.cucumber.java.After;
import net.serenitybdd.core.Serenity;

public class Hook {

    /**
     * This method is called after each scenario and closes the driver,
     * if it exists. This is necessary to ensure that the driver is closed
     * after each scenario, even if it fails.
     */
    @After
    public void tearDown() {
        if (Serenity.getDriver() != null) {
            Serenity.getDriver().close();
            Serenity.getDriver().quit();
        }
    }
}
