package com.fundacionjala.todoist;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mijhail on 19/06/2016.
 */
public class TestEditProject {

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
        ItemsMenu itemsMenu = inbox.clickProjectSelectMenu();
        itemsMenu.clickEditProjectMenuItem();
    //    final String nameSetProject = "Play";
      //  inbox.setNameProjectTestField(nameSetProject);
       // Assert.assertEquals(nameSetProject, inbox.getNameTest());
    }
}
