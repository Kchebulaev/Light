package veloc.pages;

import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import veloc.sections.Header;
import veloc.sections.NavigationTab;

public class BasePage extends WebPage {

    @FindBy(tagName = "aside")
    private NavigationTab navBar;

    @FindBy(className = "vg-header")
    private Header header;

    public NavigationTab getNavBar() {
        return navBar;
    }

    public Header getHeader() {
        return header;
    }
}
