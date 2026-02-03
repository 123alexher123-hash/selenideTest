package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HoverPage {

    public HoverPage openGithub() {
        open(baseUrl);
        return this;
    }

    public HoverPage hoverToContributors () {
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();
        return this;
    }

    public HoverPage checkUserName (String value) {
        $("[aria-label='User login and name']")
                .$("a")
                .shouldHave(text(value));
        return this;

    }
}


