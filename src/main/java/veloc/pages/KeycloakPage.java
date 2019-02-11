package veloc.pages;

import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import entities.User;

public class KeycloakPage extends WebPage {

    @FindBy(id = "username")
    private UIElement usernameField;

    @FindBy(id = "password")
    private UIElement passwordField;

    @FindBy(id = "kc-login")
    private UIElement submitButton;

    public void fillForm(User user) {
        usernameField.setText(user.name);
        passwordField.setText(user.password);
        submitButton.click();
    }
}
