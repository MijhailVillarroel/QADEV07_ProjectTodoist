package com.fundacionjala.todoist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 21/06/2016.
 */
public class TodoistSettingAccount extends BaseClass {

    @FindBy(xpath = "//*[text()=\"Account\"]")
    public WebElement optionsTab;

    @FindBy(xpath = ".//*[@id='user_info']/dl[2]/dd/span")
    public WebElement emailTest;

    @FindBy(css = ".cmp_small_close")
    private WebElement closeBoxSetting;
    private String userName = "";

    public void clickListOptionsTab() {
        optionsTab.click();
    }

    public Inbox clickCloseBoxSetting() {
        closeBoxSetting.click();
        return new Inbox();
    }

    public String getEmailTest() {

        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            userName = emailTest.getText();
        }
        catch (NoSuchElementException e){

        }
        finally {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
        return userName;
    }

    public String getUserName() {
        return userName;
    }
}
