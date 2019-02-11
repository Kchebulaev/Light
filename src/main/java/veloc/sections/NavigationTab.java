package veloc.sections;

import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.complex.UIList;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public class NavigationTab extends Section {

    public enum TabLinks {
        DASHBOARD("Dashboard"),
        REQUESTS("Requests"),
        TASKS("Tasks"),
        PLANS_PRODUCTION("Plans & Production"),
        SPACE_INVENTORY("Space & Inventory"),
        ANIMALS("Animals"),
        RACKS("Racks"),
        COLONIES("Colonies"),
        REPORTS("Reports"),
        STRAINS("Strains"),
        CALENDAR("Calendar"),
        CONFIGURATION("Configuration"),
        TAG_MANAGEMENT("Tag management"),
        MORE("More");

        private String link;

        TabLinks(String link) {
            this.link = link;
        }

        @Override
        public String toString() {
            return this.link;
        }
    }

    @FindBy(className = "vg-sidebar__logo")
    private UIElement logo;

    @FindBy(xpath = ".//ul/li/a")
    private WebList<UIElement> links;

    @FindBy(className = "vg-sidebar__toggle")
    private UIElement toggleButton;

    public boolean isExpanded() {
        return !this.getAttribute("class").contains("--collapsed");
    }

    public void expandBar() {
        if(!isExpanded()) {
            toggleButton.click();
        }
    }

    public void collapseBar() {
        if(isExpanded()) {
            toggleButton.click();
        }
    }

    public List<String> getLinksText() {
        return getLinks().values();
    }

    private WebList<UIElement> getLinks() {
        links.refresh();
        return links;
    }

    public void click(TabLinks link) {
        getLinks().select(link);
    }

    public boolean isLinkExpanded(TabLinks link) {
        return !getLinks().get(link).finds(By.xpath("../ul")).isEmpty();
    }
}
