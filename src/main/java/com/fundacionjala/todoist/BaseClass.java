package com.fundacionjala.todoist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by mijhailvillarroel on 6/18/2016.
 */
public abstract class BaseClass {

    protected WebDriver driver;


    public BaseClass() {
        driver = DriverManager.getInstance().getDriver();

        PageFactory.initElements(driver, this);
    }

    public void switchToIFrame(String parentFrame, String childFrame){
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.switchTo().frame(parentFrame).switchTo().frame(childFrame);
           // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            System.out.print(driver.getCurrentUrl());
                    }
        catch (NoSuchFrameException e){

        }finally {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        }

    }

    public void switchToIFrameOne(String parentFrame){
        try {
            driver.switchTo().frame(parentFrame);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        }
        catch (NoSuchFrameException e){

        }finally {
            driver.manage().timeouts().implicitlyWait(DriverManager.TIMEOUT_NORMAL, TimeUnit.SECONDS);
        }

    }

    public void defauldFrame() {
        driver.switchTo().defaultContent();


    }
}
