package com.fundacionjala.todoist;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class Login extends BaseClass{

    @FindBy(xpath = ".//*[@id='email']")
    private WebElement emailTestField;

    @FindBy(xpath = ".//*[@id='password']")
    private WebElement passwordTestField;

    @FindBy(css = ".amibutton.amibutton_red.sel_login")
    private WebElement logInButton;

    @FindBy(className = "GB_frame")
    private WebElement iFrameLogIn;

    public void setEmailTestField(String email) {
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

//    public static Inbox loginAS(String email, String password) {
//        Inbox inbox = new Inbox();
//        if (!dashboard.getUserNameText().equals(userName)){
//            //Dashboard.logout();
//            PivotalHome pivotalHome = new PivotalHome();
//            Login login = pivotalHome.clickSingInLink();
//            login.setUserNameTestField(userName);
//            login.setPasswordTestField(password);
//            return  login.clickSignInButton();
//        }
//        return dashboard;
//    }
}
