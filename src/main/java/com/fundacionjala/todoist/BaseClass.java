package com.fundacionjala.todoist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mijhailvillarroel on 6/18/2016.
 */
public abstract class BaseClass {

    protected WebDriver driver;

    protected WebDriverWait wait;


    public BaseClass() {
        driver = DriverManager.getInstance().getDriver();
        wait = DriverManager.getInstance().getWait();

        PageFactory.initElements(driver, this);
    }

    public void switchToIFrame(String parentFrame, String childFrame){
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.switchTo().frame(parentFrame).switchTo().frame(childFrame);
           // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

                    }
        catch (NoSuchFrameException e){

        }finally {
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }

    }


    public void defauldFrame() {
        driver.switchTo().defaultContent();


    }
}
