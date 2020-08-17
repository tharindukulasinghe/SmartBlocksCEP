package com.smartblockscep.server;

public class StreamOutputAttribute {

    private String rename;
    private String name;
    private String type = "";
    private String function;
    private boolean notLastItem = true;

    public String getRename() {
        return rename;
    }

    public void setRename(String rename) {
        this.rename = rename;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public boolean isNotLastItem() {
        return notLastItem;
    }

    public void setNotLastItem(boolean notLastItem) {
        this.notLastItem = notLastItem;
    }
}
