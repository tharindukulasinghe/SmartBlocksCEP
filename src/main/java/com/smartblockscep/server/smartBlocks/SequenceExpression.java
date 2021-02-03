package com.smartblockscep.server.smartBlocks;

import java.util.ArrayList;
import java.util.List;

public class SequenceExpression {
    private InitialInputStream initialStreamName;
    private List<InitialInputStream> inputStreamNames = new ArrayList<>();
    private String expression="";


    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }


    public InitialInputStream getInitialStreamName() {
        return initialStreamName;
    }

    public void setInitialStreamName(InitialInputStream initialStreamName) {
        this.initialStreamName = initialStreamName;
    }

    public List<InitialInputStream> getInputStreamNames() {
        return inputStreamNames;
    }

    public void setInputStreamNames(List<InitialInputStream> inputStreamNames) {
        this.inputStreamNames = inputStreamNames;
    }

    public void addInputStreamName(InitialInputStream initialInputStream) {
        this.inputStreamNames.add(initialInputStream);
    }

}
