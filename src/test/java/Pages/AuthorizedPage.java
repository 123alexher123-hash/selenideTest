package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizedPage {
    public AuthorizedPage findLoginLK(String value) {
        $("[data-block='drawer']").$("p").shouldHave(text(value));

        return this;
    }
}
