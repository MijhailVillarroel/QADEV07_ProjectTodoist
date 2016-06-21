package com.fundacionjala.todoist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mijhailvillarroel on 6/18/2016.
 */
public class DriverManager {

    private static DriverManager instance;

    private WebDriver driver;

    public static final int TIMEOUT_NORMAL = 15;

    private DriverManager () {
        initWebDriver();
    }

    public static  DriverManager getInstance() {
        if(instance == null){
            instance = new DriverManager();
        }
        return instance;
    }

    public  WebDriver getDriver(){
        return driver;
    }

    private void initWebDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(TIMEOUT_NORMAL, TimeUnit.SECONDS);
    }
}
