package veloc;

import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import veloc.pages.KeycloakPage;

public class KeycloackSite {
    @Url("/") public static KeycloakPage keycloakPage;
}
