package com.fundacionjala.todoist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class TestLogin {

    public static final String EMAIL = "mija.villa@gmail.com";
    public static final String PASSWORD = "P4ssw0rd";

    @Test
    public void testLogin() {
        TodoistHome todoistHome = new TodoistHome();
        Login login = todoistHome.clickLogInLink();
        login.swichtIFrame();
        login.setEmailTestField(EMAIL);
        login.setPasswordTestField(PASSWORD);
        Inbox inbox = login.clickLogInButton();
        final String expectResult = "Inbox";
        assertEquals(expectResult, inbox.getNameTest());
    }
}
