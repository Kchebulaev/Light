package veloc.sections;

import com.epam.jdi.light.elements.base.UIElement;
import com.epam.jdi.light.elements.complex.WebList;
import com.epam.jdi.light.elements.composite.Section;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;

import java.util.stream.Collectors;

public class Breadcrumbs extends Section {

    @FindBy(className = "vg-breadcrumbs__item")
    private WebList<UIElement> items;

    private WebList<UIElement> getItems() {
        items.refresh();
        return items;
    }

    public String getFullPath() {
        return StringUtils.join(getItems().stream().map(UIElement::getText).collect(Collectors.toList()), "/");
    }

    public UIElement getLink() {
        return getItems().stream().filter(item -> !item.finds(By.tagName("a")).isEmpty())
                .findFirst().orElseThrow(() -> new NotFoundException("No links were found in Breadcrumbs component"))
                .find(By.tagName("a"));
    }
}
