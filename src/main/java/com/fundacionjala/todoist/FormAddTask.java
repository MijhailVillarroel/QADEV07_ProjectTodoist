package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 21/06/2016.
 */
public abstract class FormAddTask  extends BaseClass {

    @FindBy(css = ".richtext_editor.sel_richtext_editor")
    WebElement nameTaskTestField;

    @FindBy(className = "amibutton amibutton_red submit_btn")
    WebElement addTaskButton;

    public void setNameTaskTestField(String nameTask) {
        nameTaskTestField.clear();
        nameTaskTestField.sendKeys(nameTask);
    }

    public ProjectContainer clickAddTaskButton() {
        addTaskButton.click();
        return new ProjectContainer();
    }

    public abstract void clickSelectNameProject();

}
