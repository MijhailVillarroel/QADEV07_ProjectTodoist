package com.fundacionjala.todoist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class SideBar extends BaseClass{

    @FindBy(xpath = "//a[contains(@class,'project')]")
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

    public ProjectContainer clickProjectSelectMenuLeft(String projectName) {

        for (WebElement projectMenuItem: ListMenuProjects) {
            if (projectName.equalsIgnoreCase(projectMenuItem.getText())) {
                projectMenuItem.click();
            }
        }
        return  new ProjectContainer();
    }

    public ItemsMenu clickLeftProject(String projectName) {
System.out.print(ListMenuProjects.size());
        for (WebElement projectMenuItem: ListMenuProjects) {
            if (projectName.equalsIgnoreCase(projectMenuItem.getText())) {
                Action rightClick = new Actions(driver)
                        .contextClick(projectMenuItem).build();
                rightClick.perform();
            }
        }
        return  new ItemsMenu();
    }

    public ItemsMenu clickSubMenu(String projectName) {
        //span[text()="test36"]
       // wait.until(ExpectedConditions.visibilityOfAllElements(ListMenuProjects));
        WebElement taskElement = driver.findElement(By.xpath("//span[text()='" + projectName + "']"));

        Action rightClick = new Actions(driver)
                .contextClick(taskElement).build();
        rightClick.perform();
        return new ItemsMenu();
    }

    public Boolean projecteExistsinList(String projectName) {
        By project = By.xpath("//span[text()='" + projectName + "']");
        return CommonMethod.isElementPresent(driver.findElement(project));
    }

    public void setNameProjectTestField(String nameProject) {
        nameProjectTestField.clear();
        nameProjectTestField.sendKeys(nameProject);
    }

    public String getTitlePageInbox() {
        return nameInboxTest.getText();
    }

}
