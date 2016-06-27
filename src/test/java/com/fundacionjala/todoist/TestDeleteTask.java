package com.fundacionjala.todoist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mijhailvillarroel on 6/22/2016.
 */
public class TestDeleteTask {


    public static final String PROJECT_NAME = "TestDelete";

    public static final String NEW_NAME_TASK = "name_task";

    private ProjectContainer projectContainer;

    private FormAddTask formAddTask;

    @Before
    public void setUp() {
        SideBar sideBar =  Login.loginAsPrimaryUser().getSideBar();
        sideBar.clickLinkCreateProject();
        sideBar.setNameProjectTestField(PROJECT_NAME);
        sideBar.clickAddProjectButton();
        projectContainer = sideBar.clickProjectSelectMenuLeft(PROJECT_NAME);
        final int priority = 1;
        formAddTask = projectContainer.clickAddTaskLink();
        formAddTask.setNameTaskTestField(NEW_NAME_TASK);
        formAddTask.selectPriority(priority);
        projectContainer = formAddTask.clickAddTaskButton();
    }

    @Test
    public void testDeleteTask() {
        projectContainer.clickTaskMenu(NEW_NAME_TASK);
        Assert.assertFalse("Task should be not delete", projectContainer.clickDeleteTask().isTaskAdded(NEW_NAME_TASK));
    }
}
