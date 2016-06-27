package com.fundacionjala.todoist;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class ToolBar extends BaseClass {

    @FindBy(id = "gear_holder")
    public WebElement setingTodoist;

    @FindBy(id = "quick_add_task_holder")
    private WebElement addTaskIcon;

    @FindBy(xpath = "html/body/div[15]/table/tbody/")
    private List<WebElement> listMenu;

    @FindBy(xpath = "//span[contains(.,'Todoist Settings')]")
    private WebElement todoistSettingsMenuItem;


    public TodoistSettingAccount clickTodoistSettingMenu() {
//        System.out.print(listMenu.size());
        todoistSettingsMenuItem.click();
        return new TodoistSettingAccount();
    }

    public void clickSetingTodoist() {
        wait.until(ExpectedConditions.visibilityOf(setingTodoist));
        setingTodoist.click();
    }

    public void swichtIFrame(){
        final String nameIDFrame = "GB_frame";
        switchToIFrame(nameIDFrame, nameIDFrame);
        //driver.switchTo().frame(nameIDFrame).switchTo().frame(nameIDFrame);
    }

    public QuickAddTask clickAddTaskIcon() {
        addTaskIcon.click();
        return new QuickAddTask();
    }

}
