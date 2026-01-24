package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class loginLK {

    @Test
    void loginPositive() {

        open("https://test.aqsi.ru/login");

        $("[data-input='input']").$("input").setValue("a.yakovlev+test@aqsi.ru");
        $("[data-input='password']").setValue("aQsi1312");
        $("[data-button='submitBtn']").click();

        $("[data-block='drawer']").$("p").shouldHave(text("a.yakovlev+test@aqsi.ru"));
        sleep(2000);

    }
}
