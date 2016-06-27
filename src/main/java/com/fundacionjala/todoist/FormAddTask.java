package com.fundacionjala.todoist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Mijhail on 21/06/2016.
 */
public class FormAddTask  extends BaseClass {

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    protected WebElement nameTaskTestField;

    @FindBy(css = ".amibutton.amibutton_red.submit_btn")
    protected WebElement addTaskButton;

    @FindBy(xpath = "//img[contains(@class,'cmp_priority') " +
            "and contains(@class, 'form_action_icon menu_icon')]")
    private WebElement priorityIcon;

    @FindBy(css = ".AmiMenu.priority_menu")
    private WebElement priorityMenu;

    public void setNameTaskTestField(String newNameTask) {
        nameTaskTestField.clear();
        nameTaskTestField.sendKeys(newNameTask);
    }

    public ProjectContainer clickAddTaskButton() {
        addTaskButton.click();
        return new ProjectContainer();
    }

    public void selectPriority(int priority){
        clickWebElement(priorityIcon);
        priorityMenu.findElement(By.cssSelector("img.cmp_priority" + priority)).click();
//        //Another implementation using xpath
//        driver.findElement(By.xpath("//div[@class='AmiMenu priority_menu']/descendant::img[@class='cmp_priority" + priority + "']")).click();
    }

    public static void clickWebElement(WebElement webElement) {
        DriverManager.getInstance().getWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }
}
