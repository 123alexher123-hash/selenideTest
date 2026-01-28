package Pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HoverPage {

    private final String USER_NAME = "asolntsev";

    public HoverPage hoverToUser () {
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest(".BorderGrid-cell").$$("ul li").first().hover();
        return this;
    }

    public HoverPage checkUserName () {
        $("[aria-label='User login and name']").$("a").shouldHave(text(USER_NAME));
        return this;

    }
}
