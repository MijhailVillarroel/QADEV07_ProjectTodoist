package com.fundacionjala.todoist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/21/2016.
 */
public class QuickAddTask extends FormAddTask {

    @FindBy(css = "a > .project_select_item > span")
    private WebElement projectSelector;

    public void selectProject(String projectName) {
        clickWebElement(projectSelector);
        By projectOption = By.xpath("//span[@class='project_select_item' and contains(., '" + projectName + "')]");
        driver.findElement(projectOption).click();
    }
}
