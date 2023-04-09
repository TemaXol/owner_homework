package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import utils.AttachmentsTest;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    public static String env = System.getProperty("env");

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider provider = new WebDriverProvider();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        AttachmentsTest.screenAttach();
        AttachmentsTest.browserConsoleLogs();
        closeWebDriver();
        AttachmentsTest.addVideo();
    }

}

