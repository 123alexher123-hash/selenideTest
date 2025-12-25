package github;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class selenideRepoSearch {
    @Test

    void shouldFindSelenideRepoAtTheTop() {

        open("https://github.com/");


        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[data-testid='results-list']").$("a").click();

        sleep(5000);

    }
}
