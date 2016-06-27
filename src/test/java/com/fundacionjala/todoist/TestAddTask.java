package com.fundacionjala.todoist;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mijhailvillarroel on 6/22/2016.
 */
public class TestAddTask {
    public static final String EMAIL = "mija.villa@gmail.com";

    public static final String PASSWORD = "P4ssw0rd";

    private SideBar sideBar;
    private Inbox inbox;

    public static final String PROJECT_NAME = "TestTasks";
    private ProjectContainer projectContainer;
    public static final String NEW_NAME_TASK = "name_task";


    @Before
    public void setUp() {
        inbox = Login.loginAsPrimaryUser();
        sideBar =  inbox.getSideBar();
        sideBar.clickLinkCreateProject();
        sideBar.setNameProjectTestField(PROJECT_NAME);
        sideBar.clickAddProjectButton();
        projectContainer = sideBar.clickProjectSelectMenuLeft(PROJECT_NAME);
    }

    @Test
    public void testAddTaskFromInbox() {
        final int priority = 1;
        FormAddTask addTask = projectContainer.clickAddTaskLink();
        addTask.setNameTaskTestField(NEW_NAME_TASK);
        addTask.selectPriority(priority);
        projectContainer = addTask.clickAddTaskButton();
        Assert.assertTrue("Task should be added", projectContainer.isTaskAdded(NEW_NAME_TASK));
    }

    @After
    public void tearDown() {
        projectContainer.clickTaskMenu(NEW_NAME_TASK);
        projectContainer.clickDeleteTask();
        inbox = projectContainer.returnInbox();
    }
}
