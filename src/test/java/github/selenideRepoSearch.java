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

        sleep(5000);



        //$("[placeholder='Search or jump to...']").click();
        //$("[placeholder='Search or jump to...']").sendKeys("selenide", Keys.ENTER);
    }
}
