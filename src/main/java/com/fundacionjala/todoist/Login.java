package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class Login extends BaseClass{

    @FindBy(id = "email")
    private WebElement emailTestField;

    @FindBy(id= "password")
    private WebElement passwordTestField;

    @FindBy(css = ".amibutton.amibutton_red.sel_login")
    private WebElement logInButton;

    @FindBy(className = "GB_frame")
    private WebElement iFrameLogIn;
    private static Inbox inbox = new Inbox();;
    private static TodoistSettingAccount todoistSettingAccount = new TodoistSettingAccount();

    public void setEmailTestField(String email) {
//        wait.until(ExpectedConditions.visibilityOf(iFrameLogIn));
        emailTestField.clear();
        emailTestField.sendKeys(email);
    }

    public void setPasswordTestField(String password) {
        passwordTestField.clear();
        passwordTestField.sendKeys(password);
    }

    public Inbox clickLogInButton() {
        logInButton.click();
        return new Inbox();
    }

    public void swichtIFrame(){
        final String nameIDFrame = "GB_frame";
        switchToIFrame(nameIDFrame,nameIDFrame);
    }

    public static Inbox loginAsPrimaryUser() {
        final String email = "mija.villa@gmail.com";
        final String password = "P4ssw0rd";
        return loginAS(email, password);
    }

    public static Inbox loginAS(String email, String password) {

        if (!email.equals(todoistSettingAccount.getUserName())){
            TodoistHome todoistHome = new TodoistHome();
            Login login = todoistHome.clickLogInLink();
            login.swichtIFrame();
            login.setEmailTestField(email);
            login.setPasswordTestField(password);
            inbox = login.clickLogInButton();
            ToolBar toolBar = inbox.getToolBar();
            toolBar.clickSetingTodoist();
            todoistSettingAccount = toolBar.clickTodoistSettingMenu();
            toolBar.swichtIFrame();
            todoistSettingAccount.clickListOptionsTab();
            todoistSettingAccount.getEmailTest();
            todoistHome.defauldFrame();
            return todoistSettingAccount.clickCloseBoxSetting();
        }
        return inbox;
    }
}
