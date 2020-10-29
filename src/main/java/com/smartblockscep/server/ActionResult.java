package com.smartblockscep.server;

public class ActionResult {

    public ActionResult(String data) {
        this.data = data;
    }

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
