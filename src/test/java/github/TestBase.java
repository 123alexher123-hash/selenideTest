package github;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    @BeforeAll
    static void setup() {
        baseUrl = "https://github.com/selenide/selenide";
        browserSize = "2560x1440";
    }

    @AfterEach
    public void afterEach () {
        closeWebDriver();
    }
}
