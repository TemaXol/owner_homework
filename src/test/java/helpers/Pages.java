package helpers;

import static com.codeborne.selenide.Selenide.open;

public class Pages {

    public Pages openPage() {
        open("https://dodopizza.ru");
        return this;
    }
}
