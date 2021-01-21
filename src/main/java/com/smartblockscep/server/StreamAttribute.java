package com.smartblockscep.server;

public class StreamAttribute {

    private String name;
    private String type;


    public boolean isNotLastItem() {
        return notLastItem;
    }

    public void setNotLastItem(boolean notLastItem) {
        this.notLastItem = notLastItem;
    }

    private boolean notLastItem = true;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    private String functionName;

    public boolean isParsed() {
        return isParsed;
    }

    public void setParsed(boolean parsed) {
        isParsed = parsed;
    }

    private boolean isParsed;

    public String toString() {
        return "StreamAttribute{" +
                "name=" + name +", "+
                "type=" + type +" "+
                '}';
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



}
