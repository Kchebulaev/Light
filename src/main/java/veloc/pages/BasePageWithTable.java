package veloc.pages;

import com.epam.jdi.light.elements.complex.table.Table;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.objects.JTable;

import java.util.List;

public class BasePageWithTable extends BasePage {

    @JTable(root = @FindBy(className = "vg-table"),
            headers = @FindBy(xpath = "./*/div[@class='k-grid-header']//thead/tr/th"),
            column = @FindBy(xpath = "./td"),
            row = @FindBy(xpath = ".//table[@class='k-grid-table']/tbody/tr"),
            cell = @FindBy(xpath = ".//table[@class='k-grid-table']/tbody/tr[{1}]/td[{0}]"))
    private Table list;

    public Table getList() {
        return this.list;
    }

    public List<String> getHeaders() {
        return getList().header();
    }

}
