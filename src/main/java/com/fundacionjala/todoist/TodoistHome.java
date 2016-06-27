package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class TodoistHome extends BaseClass {

    public static final String TODOIST_URL = "https://en.todoist.com/";

    @FindBy(className = "sel_login")
    private WebElement logInLink;

    public TodoistHome() {
        driver.get(TODOIST_URL);
    }

    public Login clickLogInLink() {
        logInLink.click();
        return new Login();
    }
}
