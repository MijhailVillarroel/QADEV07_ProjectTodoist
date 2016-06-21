package com.fundacionjala.todoist;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class SideBar extends BaseClass{

    @FindBy(css = ".action.sel_add_project")
    private WebElement linkCreateProject;

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    private WebElement nameProjectTestField;

    @FindBy(css = ".amibutton.amibutton_red.submit_btn")
    private WebElement addProjectButton;

    @FindBy(css= ".name")
    private List<WebElement> ListMenuProjects;

    @FindBy(id = "filter_inbox")
    private WebElement nameInboxTest;

    @FindBy(css = ".icon.menu.cmp_menu_on.gear_menu")
    private List<WebElement> projectsSubMenuItem;

    public void clickLinkCreateProject() {
        linkCreateProject.click();
        // return  new Dashboard();
    }

    public ProjectContainer clickAddProjectButton() {
        addProjectButton.click();
        return new ProjectContainer();
    }

    public ItemsMenu clickProjectSelectMenuLeft(String projectName) {
      //  System.out.println(ListMenuProjects.size());
        for (WebElement projectMenuItem: ListMenuProjects) {
            if (projectName.equalsIgnoreCase(projectMenuItem.getText())) {
                projectMenuItem.click();
                projectsSubMenuItem.get(ListMenuProjects.indexOf(projectMenuItem)).click();
            }
        }
        return  new ItemsMenu();
    }

    public void setNameProjectTestField(String nameProject) {
        nameProjectTestField.clear();
        nameProjectTestField.sendKeys(nameProject);
    }

    public String getTitlePageInbox() {
        return nameInboxTest.getText();
    }

}
