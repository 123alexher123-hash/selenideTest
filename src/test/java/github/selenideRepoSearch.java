package github;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class selenideRepoSearch {
    @Test

    void shouldFindSelenideRepoAtTheTop() {

        open("https://github.com/");

        $("[placeholder='Search or jump to...']").click();
        $("[placeholder='Search or jump to...']").sendKeys("selenide", Keys.ENTER);
    }
}
