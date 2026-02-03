package github;

import Pages.HoverPage;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class BestContributor extends TestBase {

    HoverPage hoverPage = new HoverPage();

    @Test
    void andreiSolntsevShouldBeFirstContributor(){

        hoverPage
                .openGithub()
                .hoverToContributors()
                .checkUserName("asolntsev");

        sleep(5000);
    }

}








