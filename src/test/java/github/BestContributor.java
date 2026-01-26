package github;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributor {

    @BeforeAll
    static void setup() {
        browserSize = "2560x1440";
    }
    @Test
    void andreiSolntsevShouldBeFirstContributor(){

        open("https://github.com/selenide/selenide");

        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();
        sleep(2000);
        //$$(".Popover-message").shouldHave(text("Andrei Solntsev"));
        $("[aria-label='User login and name']").$("a").shouldHave(text("asolntsev"));
        sleep(5000);
    }
}
