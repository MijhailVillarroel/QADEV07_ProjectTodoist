package com.fundacionjala.todoist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by mijhailvillarroel on 6/22/2016.
 */
public class TestQuickAddTask {
    public static final String EMAIL = "mija.villa@gmail.com";

    public static final String PASSWORD = "P4ssw0rd";

    private SideBar sideBar;
    private ToolBar toolBar;

    public static final String PROJECT_NAME = "TestP01";
    private ProjectContainer projectContainer;
    public static final String NEW_NAME_TASK = "name_task";


    @Before
    public void setUp() {
        TodoistHome todoistHome = new TodoistHome();
        Login login = todoistHome.clickLogInLink();
        login.swichtIFrame();
        login.setEmailTestField(EMAIL);
        login.setPasswordTestField(PASSWORD);
        Inbox inbox = login.clickLogInButton();
        login.defauldFrame();
        sideBar = inbox.getSideBar();
        sideBar.clickLinkCreateProject();
        sideBar.setNameProjectTestField(PROJECT_NAME);
        sideBar.clickAddProjectButton();
        projectContainer = sideBar.clickProjectSelectMenuLeft(PROJECT_NAME);
        toolBar = inbox.getToolBar();
    }

    @Test
    public void testQuickAddTask() {
        final int priority = 1;
        QuickAddTask quickAddTask = toolBar.clickAddTaskIcon();
        quickAddTask.setNameTaskTestField(NEW_NAME_TASK);
        quickAddTask.selectPriority(priority);
        projectContainer = quickAddTask.clickAddTaskButton();
        assertTrue("Task with Quick add not create task", projectContainer.isTaskAdded(NEW_NAME_TASK));
    }
}
