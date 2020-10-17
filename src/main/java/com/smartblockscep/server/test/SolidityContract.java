package com.smartblockscep.server.test;

import com.smartblockscep.server.InputStreamEvent;

import java.util.List;

public class SolidityContract {
    private List<InputStreamEvent> inputStreamEventList;

    public List<InputStreamEvent> getInputStreamEventList() {
        return inputStreamEventList;
    }

    public void setInputStreamEventList(List<InputStreamEvent> inputStreamEventList) {
        this.inputStreamEventList = inputStreamEventList;
    }
}
