package com.smartblockscep.server.test;

import com.smartblockscep.server.StreamAttribute;

import java.util.ArrayList;
import java.util.List;

public class InitialInputStream {
    private String name;
    private String referenceId;
    private String expression;
    private boolean isInitial = false;
    private List<StreamAttribute> streamAttributeList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public boolean isInitial() {
        return isInitial;
    }

    public void setInitial(boolean initial) {
        isInitial = initial;
    }

    public List<StreamAttribute> getStreamAttributeList() {
        return this.streamAttributeList;
    }

    public void setStreamAttributeList(List<StreamAttribute> streamAttributeList) {
        this.streamAttributeList = streamAttributeList;
    }
}
