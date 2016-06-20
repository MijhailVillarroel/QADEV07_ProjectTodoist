package com.fundacionjala.todoist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

    public void switchToIFrame(WebElement webElement){
        driver.switchTo().frame("GB_frame").switchTo().frame("GB_frame");
    }

    public void defauldFrame() {
        driver.switchTo().defaultContent();
        System.out.print(driver.getCurrentUrl());
    }
}
