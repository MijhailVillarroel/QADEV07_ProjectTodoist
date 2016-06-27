package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class ItemsMenu extends BaseClass {

    @FindBy(xpath = "//span[text()='Edit project']")
    private WebElement editProjectMenuItem;

    @FindBy(id = "menu_delete_text")
    private WebElement deleteProjectMenuItem;


    @FindBy(xpath = "//span[text()=Edit project]")
    private WebElement editProjectTestField;


    public void clickEditProjectMenuItem() {
       editProjectMenuItem.click();
    }

    public void setNameProjectTestField(String nameProject) {
        editProjectTestField.clear();
        editProjectTestField.sendKeys(nameProject);
    }

    public DeleteAlertBox clickDeleteProjectMenuItem() {
        deleteProjectMenuItem.click();
        return new DeleteAlertBox();
    }


}
