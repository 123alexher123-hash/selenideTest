package github;

import Pages.HoverPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributor {

    HoverPage hoverPage = new HoverPage();
    @BeforeAll
    static void setup() {
        baseUrl = "https://github.com/selenide/selenide";
        browserSize = "2560x1440";
    }
    @Test
    void andreiSolntsevShouldBeFirstContributor(){

        open(baseUrl);
        hoverPage.hoverToUser()
                .checkUserName();

        //$("div.Layout-sidebar").$(byText("Contributors"))
                //.closest(".BorderGrid-cell").$$("ul li").first().hover();
        //$("[aria-label='User login and name']").$("a").shouldBe(visible);
        //$("[aria-label='User login and name']").$("a").shouldHave(text("asolntsev"));

        sleep(5000);
    }
}
