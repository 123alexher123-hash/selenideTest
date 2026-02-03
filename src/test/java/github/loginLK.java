package github;

import Pages.AuthorizedPage;
import Pages.LoginLkPage;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class loginLK extends TestBaseLogin{

    LoginLkPage loginLkPage = new LoginLkPage();
    AuthorizedPage authorizedPage = new AuthorizedPage();

    @Test
    void loginPositive() {

        loginLkPage
                .openLoginPage()
                .setValueLogin("a.yakovlev+test@aqsi.ru")
                .setValuePassword("aQsi1312")
                .clickSubmitBtn();
        authorizedPage
                .findLoginLK("a.yakovlev+test@aqsi.ru");

        sleep(2000);

    }
}
