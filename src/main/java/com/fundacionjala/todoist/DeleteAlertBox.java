package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by mijhailvillarroel on 6/22/2016.
 */
public class DeleteAlertBox extends BaseClass {

    @FindBy(css = "div.GB_Window_holder")
    private WebElement deleteAlertContainer;

    @FindBy(xpath = "//span[contains(.,'Ok')]")
    private WebElement okBtn;

    public Inbox clickOkBtn() {
        wait.until(ExpectedConditions.visibilityOf(deleteAlertContainer));
        okBtn.click();
        return  new Inbox();
    }
}
