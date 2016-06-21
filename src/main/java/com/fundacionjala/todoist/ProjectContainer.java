package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mijhailvillarroel on 6/20/2016.
 */
public class ProjectContainer extends BaseClass {

    @FindBy(className = "project_link")
    private WebElement projectNameLabel;

    public String getProjectNameLabel(){
        return projectNameLabel.getText();
    }
}
