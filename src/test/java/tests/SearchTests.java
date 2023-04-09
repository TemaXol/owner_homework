package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Elements;
import helpers.Pages;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {


    Pages pages = new Pages();
    Elements elements = new Elements();
    RandomData randomData = new RandomData();

    @Test
    @Tag("project")
    public void incorrectCity() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select incorrect Town" + randomData.incorrectTown, () -> {
            elements.choozeCity(randomData.incorrectTown);
        });
        step("check incorrect Town", () -> {
            elements.checkIncorrectTown();
        });
    }

    @Test
    @Tag("project")
    public void changeCity() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("change City", () -> {
            elements.changeCity();
        });
        step("select another City" + randomData.town, () -> {
            elements.choozeCity(randomData.town);
        });
        step("check City" + randomData.town, () -> {
            elements.checkCity(randomData.town);
        });
    }

}