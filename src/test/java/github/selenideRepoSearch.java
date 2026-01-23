package github;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class selenideRepoSearch {
    @Test

    void shouldFindSelenideRepoAtTheTop() {

        open("https://github.com/");


        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[data-testid='results-list']").$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        sleep(5000);

    }
}
