package github;

import Pages.AuthorizedPage;
import Pages.LoginLkPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.*;

public class loginLK extends TestBaseLogin{

    LoginLkPage loginLkPage = new LoginLkPage();
    AuthorizedPage authorizedPage = new AuthorizedPage();

    @CsvSource(value = {
            "a.yakovlev+test@aqsi.ru,  aQsi1312",
            "a.yakovlev+1@aqsi.ru,     aQsi1312",
    })
    @ParameterizedTest(name = "После авторизации в ЛК отображается {0}")
    void loginPositive(String login, String password) {

        loginLkPage
                .openLoginPage()
                .setValueLogin(login)
                .setValuePassword(password)
                .clickSubmitBtn();
        authorizedPage
                .findLoginLK(login);

        sleep(2000);

    }
}
