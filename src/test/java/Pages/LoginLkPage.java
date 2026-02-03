package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Configuration.baseUrl;

public class LoginLkPage {

    public LoginLkPage openLoginPage() {
        open(baseUrl);
        return this;
    }

    public LoginLkPage setValueLogin(String value) {
        $("[data-input='input']").$("input").setValue(value);
        return this;
    }

    public LoginLkPage setValuePassword(String value) {
        $("[data-input='password']").setValue(value);
        return this;
    }

    public LoginLkPage clickSubmitBtn() {
        $("[data-button='submitBtn']").click();
        return this;
    }

}
