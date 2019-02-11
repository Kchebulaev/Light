package veloc.pages;

import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.XPath;

public class LoginPage extends WebPage {

    @XPath("//button")
    private UIElement button;

    public UIElement getButton() {
        return button;
    }
}
