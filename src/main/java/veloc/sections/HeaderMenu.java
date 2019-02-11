package veloc.sections;

import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import org.openqa.selenium.By;

public class HeaderMenu extends Section {

    @FindBy(xpath = "./ul/li")
    private WebList<UIElement> menuItems;

    private WebList<UIElement> getMenuItems() {
        menuItems.refresh();
        return menuItems;
    }

    public void logout() {
        getMenuItems().get(0).click();
        getMenuItems().get(0).find(By.tagName("button")).click();
    }
}
