package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mijhail on 19/06/2016.
 */
public class TestEditProject {

    public static final String PROJECT_NAME = "TestP01";

    private SideBar sideBar;

    private Inbox inbox;
    public static final String NEW_PROJECT_NAME = "Play3";


    @Before
    public void setUp() {
        inbox = Login.loginAsPrimaryUser();
        sideBar = inbox.getSideBar();
        sideBar.clickLinkCreateProject();
        sideBar.setNameProjectTestField(PROJECT_NAME);
        sideBar.clickAddProjectButton();
        sideBar.clickProjectSelectMenuLeft(PROJECT_NAME);
    }

    @Test
    public void testEditProject() {
        ItemsMenu itemsMenu = sideBar.clickSubMenu(PROJECT_NAME);
        itemsMenu.clickEditProjectMenuItem();
        sideBar.setNameProjectTestField(NEW_PROJECT_NAME);
        ProjectContainer projectContainer = sideBar.clickAddProjectButton();
        assertEquals(NEW_PROJECT_NAME, projectContainer.getProjectNameLabel());
    }

//    @Test
//    public void testDeleteProject() {
//        ItemsMenu itemsMenu = sideBar.clickSubMenu(PROJECT_NAME);
//        DeleteAlertBox deleteAlertBox = itemsMenu.clickDeleteProjectMenuItem();
//        inbox = deleteAlertBox.clickOkBtn();
//        assertTrue("Project Exist",inbox.getSideBar().projecteExistsinList(PROJECT_NAME));
//    }

    @After
    public void cleanUp(){
        ItemsMenu itemsMenu = sideBar.clickLeftProject(NEW_PROJECT_NAME);
        DeleteAlertBox deleteAlertBox = itemsMenu.clickDeleteProjectMenuItem();
        inbox = deleteAlertBox.clickOkBtn();
    }
}
