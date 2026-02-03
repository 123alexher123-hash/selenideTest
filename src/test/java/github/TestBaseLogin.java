package github;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class TestBaseLogin {

    @BeforeAll
    static void setupLogin() {
        baseUrl = "https://test.aqsi.ru/login";
        browserSize = "1920x1080";
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }
}
