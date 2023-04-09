package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;
import tests.TestBase;

import java.util.Map;


public class WebDriverProvider extends TestBase {
    private DriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(DriverConfig.class, System.getProperties());
        createWebDriver();
    }

    private void createWebDriver() {
        Configuration.browser = config.getBrowser();
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = config.getRemoteURL();
        Configuration.browserSize = config.getBrowserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));
        Configuration.browserCapabilities = capabilities;
    }
}