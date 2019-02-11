package veloc.sections;

import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;

public class Header extends Section {

    @FindBy(className = "vg-breadcrumbs__ol")
    private Breadcrumbs breadcrumbs;

    @FindBy(className = "vg-headerMenu")
    private HeaderMenu headerMenu;

    public Breadcrumbs getBreadcrumbs() {
        return breadcrumbs;
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }
}
