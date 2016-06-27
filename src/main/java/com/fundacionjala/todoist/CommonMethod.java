package com.fundacionjala.todoist;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

/**
 * Created by mijhailvillarroel on 6/22/2016.
 */
public class CommonMethod {

    public static boolean isElementPresent(WebElement webElement) {
        try {
            webElement.getTagName();
            return true;
        } catch (NoSuchElementException ex) {
        return false;
    } catch (WebDriverException e) {
            return false;
        }
    }
}
