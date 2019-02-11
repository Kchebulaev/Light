package io.github.epam.tests;

import io.github.epam.TestsInit;
import entities.User;
import org.testng.annotations.Test;

import static veloc.KeycloackSite.keycloakPage;
import static veloc.VeloSite.*;

public class tt extends TestsInit {

    @Test()
    private void test() throws InterruptedException {
        User user = new User();
        user.name = "aqa2";
        user.password = "aqa2";
        loginPage.open();
        loginPage.getButton().click();
        keycloakPage.fillForm(user);
        basePage.getNavBar();
        rackListPage.open();
        rackListPage.getList().webCell(2,1).getText();
        Thread.sleep(2000);
    }
}
