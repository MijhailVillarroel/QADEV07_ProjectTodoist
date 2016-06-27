package com.fundacionjala.todoist;

/**
 * Created by Mijhail on 18/06/2016.
 */
public class Inbox extends BaseClass{

    private SideBar sideBar;

    private ToolBar toolBar;

    public Inbox() {
        toolBar = new ToolBar();
        sideBar = new SideBar();
    }

    public SideBar getSideBar() {
        return sideBar;
    }

    public ToolBar getToolBar() {
        return toolBar;
    }

    public String getTitlePageInbox() {
        return driver.getTitle();
    }
}
