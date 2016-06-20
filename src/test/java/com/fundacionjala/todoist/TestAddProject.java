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
        TodoistHome todoistHome = new TodoistHome();
        Login login = todoistHome.clickLogInLink();
        login.swichtIFrame();
        login.setEmailTestField(EMAIL);
        login.setPasswordTestField(PASSWORD);
        inbox = login.clickLogInButton();
        login.defauldFrame();
    }

    @Test
    public void testAddProjectNew() {
        final String nameProject = "Test";
        inbox.clicklinkCreateProject();
        inbox.setNameProjectTestField(nameProject);
        inbox.clickAddProjectButton();
        assertEquals(nameProject, inbox.getNameTest());
    }
}
