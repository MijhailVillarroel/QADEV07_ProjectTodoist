package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 21/06/2016.
 */
public class TodoistSettingAccount {

    @FindBy(xpath = ".//*[@id='settings_content']/fieldset[2]/dl/dt")
    public WebElement optionsTab;

    public void clickListOptionsTab() {

        System.out.print(optionsTab.getTagName());
        //return  new ItemsMenu();
    }
}
