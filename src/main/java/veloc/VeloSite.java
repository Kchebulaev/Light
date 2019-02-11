package veloc;

import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import veloc.pages.BasePage;
import veloc.pages.BasePageWithTable;
import veloc.pages.LoginPage;
import veloc.pages.RackListPage;

public class VeloSite {

    @Url("/login") public static LoginPage loginPage;
    @Url("/") public static BasePage basePage;
    @Url(template = ".*") public static BasePageWithTable basePageWithTable;
    @Url("/space_and_inventory/racks") public static RackListPage rackListPage;
}
