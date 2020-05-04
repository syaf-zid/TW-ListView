package com.myapplicationdev.android.tw_listview;

public class Module {
    private String module;
    private boolean project;
    public Module(String module, boolean project) {
        this.module = module;
        this.project = project;
    }
    public String getModule() {
        return module;
    }
    public boolean isProject() {
        return project;
    }

}
