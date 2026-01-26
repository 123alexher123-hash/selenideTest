package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class otpBankCookies {

    @Test
    void otpBankCookies() {

        open("https://www.otpbank.ru");

        $(withText("Мы используем cookie.")).shouldBe(visible);
        $(".p-cookies-notification").$("button").click();
        $(withText("Мы используем cookie.")).shouldBe(hidden);

        sleep(5000);
    }

    @Test
    void required() {
        open("https://www.reddit.com/login/");

        $("[name='username']").shouldHave(attribute("required"));

        sleep(7000);
    }
}
