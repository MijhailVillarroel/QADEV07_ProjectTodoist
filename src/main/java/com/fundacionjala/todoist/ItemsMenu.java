package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class ItemsMenu {

    @FindBy(xpath = "//tr[4]/td/div/span")
    private WebElement editProjectMenuItem;

    @FindBy(id = "menu_delete_text")
    private WebElement deleteProjectMenuItem;

    @FindBy(css = "//tr[4]/td/div/span")
    private WebElement clickDeleteOKButton;

    public void clickEditProjectMenuItem() {
        editProjectMenuItem.click();
    }

    public void clickDeleteProjectMenuItem() {
        deleteProjectMenuItem.click();
    }

    public void  clickClickDeleteOKButton() {
        clickDeleteOKButton.click();
    }
}
