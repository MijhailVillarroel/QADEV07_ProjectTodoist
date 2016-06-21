package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class ItemsMenu extends BaseClass {

    @FindBy(xpath = "html/body/div[5]/table/tbody/tr[4]/td")
    private WebElement editProjectMenuItem;

    @FindBy(id = "menu_delete_text")
    private WebElement deleteProjectMenuItem;

    @FindBy(css = "//tr[4]/td/div/span")
    private WebElement clickDeleteOKButton;

    @FindBy(xpath = ".//*[@id='project_list']/li[2]/form/table[1]/tbody/tr/td[1]/table/tbody/tr/td/div[2]")
    private WebElement editProjectTestField;


    public void clickEditProjectMenuItem() {
       editProjectMenuItem.click();
    }


    public void setNameProjectTestField(String nameProject) {
        editProjectTestField.clear();
        editProjectTestField.sendKeys(nameProject);
    }

    public void clickDeleteProjectMenuItem() {
        deleteProjectMenuItem.click();
    }

    public void  clickClickDeleteOKButton() {
        clickDeleteOKButton.click();
    }
}
