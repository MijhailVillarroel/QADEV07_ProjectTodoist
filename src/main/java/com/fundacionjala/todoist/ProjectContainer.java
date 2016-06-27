package com.fundacionjala.todoist;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class ProjectContainer extends BaseClass {

    @FindBy(className = "project_link")
    private WebElement projectNameLabel;

    @FindBy(linkText = "Add Task")
    private WebElement addTaskLink;

    @FindBy(xpath = "//div[@class='AmiMenu' and not(contains(@style, 'none'))]/descendant::div[contains(.,'Delete task')]")
    private WebElement deleteTaskOption;

    @FindBy(xpath = "//div[@class='AmiMenu' and not(contains(@style, 'none'))]/descendant::div[contains(.,'Edit task')]")
    private WebElement editTaskOption;

    public FormAddTask clickAddTaskLink() {
        addTaskLink.click();
        return new FormAddTask();
    }

    public void clickTaskMenu(String taskName) {
        WebElement taskElement = driver.findElement(By.xpath("//tr[contains(.,'" + taskName + "')]"));

        Action rightClick = new Actions(driver)
                .contextClick(taskElement).build();
        rightClick.perform();
    }

    public ProjectContainer clickDeleteTask() {
        deleteTaskOption.click();
        DeleteAlertBox deleteAlert = new DeleteAlertBox();
        deleteAlert.clickOkBtn();
        return this;
    }

    public FormAddTask clickEditTask() {
        //   wait.until(ExpectedConditions.visibilityOf(editTaskOption));
        editTaskOption.clear();
        return new FormAddTask();
    }

    public Boolean isTaskAdded(String taskName) {
        try {
            By task = By.xpath("//tr[contains(.,'" + taskName + "')]");
            return CommonMethod.isElementPresent(driver.findElement(task));
        }catch (NoSuchElementException e){
            return false;
        }


    }

    public Inbox returnInbox() {
        return new Inbox();
    }

    public String getProjectNameLabel() {
        return projectNameLabel.getText();
    }
}
