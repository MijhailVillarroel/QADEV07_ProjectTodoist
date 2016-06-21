package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Mijhail on 21/06/2016.
 */
public class TestSetingTodist {

    public static final String EMAIL = "mija.villa@gmail.com";

    public static final String PASSWORD = "P4ssw0rd";

    private SideBar sideBar;
    public static final String PROJECT_NAME = "TestP01";
    private ToolBar toolBar;

    @Before
    public void setUp() {
        TodoistHome todoistHome = new TodoistHome();
        Login login = todoistHome.clickLogInLink();
        login.swichtIFrame();
        login.setEmailTestField(EMAIL);
        login.setPasswordTestField(PASSWORD);
        Inbox inbox = login.clickLogInButton();
        login.defauldFrame();
        toolBar = inbox.getToolBar();
        sideBar = inbox.getSideBar();
//        sideBar.clickLinkCreateProject();
//        sideBar.setNameProjectTestField(PROJECT_NAME);
//        sideBar.clickAddProjectButton();
    }

    @Test
    public void testEditProject() {
        toolBar.clickSetingTodoist();
        login.defauldFrame();
        TodoistSettingAccount todoistSettingAccount = toolBar.clickTodoistSettingMenu();
        toolBar.swichtIFrame();
        todoistSettingAccount.clickListOptionsTab();

//
//        //trabajar con varios metodos
//        ItemsMenu itemsMenu = sideBar.clickProjectSelectMenuLeft(PROJECT_NAME);
//        // itemsMenu.clickProjectMenuItem();
//        itemsMenu.clickEditProjectMenuItem();
//        final String newProjectName = "Play3";
//        sideBar.setNameProjectTestField(newProjectName);
//        ProjectContainer projectContainer = sideBar.clickAddProjectButton();
//        assertEquals(newProjectName, projectContainer.getProjectNameLabel());
    }

//    @Test
//    public void testDeleteProject() {
//        //trabajar con varios metodos
//        ItemsMenu itemsMenu = sideBar.clickProjectSelectMenuLeft(PROJECT_NAME);
//        itemsMenu.clickDeleteProjectMenuItem();
//        //assertEquals(newProjectName, projectContainer.getProjectNameLabel());
//    }

    @After
    public void cleanUp(){

    }
}
