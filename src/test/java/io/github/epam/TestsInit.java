package io.github.epam;

import com.epam.jdi.light.driver.WebDriverFactory;
import com.epam.jdi.light.settings.WebSettings;
import io.github.epam.testng.TestNGListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import veloc.KeycloackSite;
import veloc.VeloSite;

import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;
import static com.epam.jdi.tools.PropertyReader.getProperty;

public class TestsInit extends TestNGListener {

    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        logger.setLogLevel(STEP);
        WebSettings.DOMAIN = getProperty("keycloak");
        initElements(KeycloackSite.class);
        WebSettings.DOMAIN = getProperty("domain");
        initElements(VeloSite.class);
        logger.toLog("Run Tests");

    }
    @AfterMethod(alwaysRun = true)
    public static void tearDown() {
        WebDriverFactory.getDriver().quit();
    }
}
