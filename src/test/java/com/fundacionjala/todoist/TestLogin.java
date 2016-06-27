package com.fundacionjala.todoist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class TestLogin {

    public static final String EMAIL = "mija.villa@gmail.com";
    public static final String PASSWORD = "P4ssw0rd";
    private Inbox inbox;

    @Before
    public void setUp() {
        inbox = Login.loginAS(EMAIL, PASSWORD);
    }

    @Test
    public void testLogin() {
        //inbox = login.clickLogInButton();
        final String expectResult = "Inbox";
        System.out.print(inbox.getSideBar().getTitlePageInbox().contentEquals(expectResult));
        assertTrue("Not Equals String",expectResult.startsWith(inbox.getSideBar().getTitlePageInbox()));
    }

    @Test
    public void testGetEmail() {
        //
        ToolBar toolBar = inbox.getToolBar();
        toolBar.clickSetingTodoist();
        TodoistSettingAccount todoistSettingAccount = toolBar.clickTodoistSettingMenu();
        toolBar.swichtIFrame();
        todoistSettingAccount.clickListOptionsTab();
        assertEquals(EMAIL, todoistSettingAccount.getEmailTest());
        todoistSettingAccount.defauldFrame();
        todoistSettingAccount.clickCloseBoxSetting();
    }
}
