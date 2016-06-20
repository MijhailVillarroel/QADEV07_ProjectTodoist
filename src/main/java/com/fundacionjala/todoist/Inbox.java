package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class Inbox extends BaseClass{

    @FindBy(css = ".action.sel_add_project")
    private WebElement linkCreateProject;

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    private WebElement nameProjectTestField;

    @FindBy(css = ".amibutton.amibutton_red.submit_btn")
    private WebElement addProjectButton;

    @FindBy(xpath = "//div[@id='editor']/div/div/h2/a/span")
    private WebElement nameText;

    @FindBy(css= ".icon.menu.cmp_menu_on.gear_menu")
    private WebElement projectSelectMenuLeft;

    public void clicklinkCreateProject() {
        linkCreateProject.click();
       // return  new Dashboard();
    }

    public void clickAddProjectButton() {
        addProjectButton.click();
    }

    public ItemsMenu clickProjectSelectMenu() {
        projectSelectMenuLeft.click();
        return  new ItemsMenu();
    }

    public void setNameProjectTestField(String nameProject) {
        nameProjectTestField.clear();
        nameProjectTestField.sendKeys(nameProject);
    }

    public String getNameTest(){
        return nameText.getText();
    }
}
