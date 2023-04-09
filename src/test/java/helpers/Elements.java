package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Elements {


    private SelenideElement
            selectCity = $("[placeholder='Поиск...']"),
            checkCity = $("a.header__about-slogan-text"),
            addToOrder = $("button[data-testid=button_add_to_cart]"),
            basket = $("button[data-testid=navigation__cart]"),
            basketCheck = $(".undefined__view"),
            modalTownsChoose = $(".locality-selector-popup"),
            aboutCheck = $(".container"),
            checkDodoCoins = $(".applink"),
            selectCoins = $("a.sc-2c0aw7-0");


    public Elements checkIncorrectTown() {
        modalTownsChoose.shouldHave(text("Пиццерия в этом городе еще не открылась"));

        return this;
    }

    public Elements changeCity() {
        $(".header__about-slogan-text_link").click();

        return this;
    }

    public Elements choozeCity(String value) {
        selectCity.setValue(value).pressEnter();

        return this;
    }

    public Elements checkCity(String value) {
        checkCity.shouldHave(text(value));

        return this;
    }

    public Elements selectFood(String value) {
        $(byText(value)).click();
        addToOrder.click();

        return this;
    }

    public Elements selectBasket() {
        basket.click();

        return this;
    }

    public Elements checkBasket(String value) {
        basketCheck.shouldHave(text(value));

        return this;
    }

    public Elements selectHeaderTab(String value) {
        $(".grid").$(byText(value)).click();

        return this;
    }

    public Elements addToBasket(String value) {
        $(byText(value)).click();
        $(byXpath("//button[@class='sc-1rmt3mq-0 cpUbDl sc-18frhrp-3 guiMAG']")).click();

        return this;
    }


    public Elements selectPizzaWithOptions(String value, Integer a, String b) {

        $(byText(value)).click();
        $("label[data-testid=menu__pizza_size_" + a + "]").click();
        $(byXpath("//label[text()='" + b + "']")).click();
        addToOrder.click();

        return this;
    }

    public Elements checkAboutUS() {
        aboutCheck.shouldHave(text("Мы"));

        return this;
    }

    public Elements selectCoins() {
        selectCoins.pressEnter();

        return this;
    }

    public Elements checkCoins() {
        checkDodoCoins.shouldHave(text("Скачать приложение по QR-коду"));

        return this;
    }
}
