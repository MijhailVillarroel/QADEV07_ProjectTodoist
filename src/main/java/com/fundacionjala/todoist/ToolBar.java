package com.fundacionjala.todoist;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class ToolBar extends BaseClass {

    @FindBy(id = "gear_holder")
    public WebElement setingTodoist;

    @FindBy(id = "quick_add_task_holder")
    public WebElement addTask;

    @FindBy(xpath = "html/body/div[15]/table/tbody/")
    private List<WebElement> listMenu;

    @FindBy(xpath = "html/body/div[15]/table/tbody/tr[7]/td")
    private WebElement todoistSettingsMenuItem;


    public TodoistSettingAccount clickTodoistSettingMenu() {
//        System.out.print(listMenu.size());
        todoistSettingsMenuItem.click();
        return new TodoistSettingAccount();
    }

    public void clickSetingTodoist() {
        setingTodoist.click();
    }

    public void swichtIFrame(){
        final String nameIDFrame = "GB_frame";
        driver.switchTo().frame(nameIDFrame).switchTo().frame(nameIDFrame);
        System.out.print(driver.getCurrentUrl());
    }

}
