package com.fundacionjala.todoist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mijhail on 19/06/2016.
 */
public class TestAddProject {

    public static final String EMAIL = "mija.villa@gmail.com";

    public static final String PASSWORD = "P4ssw0rd";

    private Inbox inbox;

    @Before
    public void setUp() {
        inbox = Login.loginAsPrimaryUser();
    }

    @Test
    public void testAddProjectNew() {
        SideBar sideBar = inbox.getSideBar();
        final String expectedValue = "Test3";
        sideBar.clickLinkCreateProject();
        sideBar.setNameProjectTestField(expectedValue);
        ProjectContainer projectContainer = sideBar.clickAddProjectButton();
        assertEquals(expectedValue, projectContainer.getProjectNameLabel());
    }
}
