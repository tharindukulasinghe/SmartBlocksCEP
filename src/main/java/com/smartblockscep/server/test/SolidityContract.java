package com.smartblockscep.server.test;

import com.smartblockscep.server.InputStreamEvent;
import com.smartblockscep.server.StreamOutputAttribute;

import java.util.List;

public class SolidityContract {

    private final String version = "0.1.2";
    private final String name = "DataQualityContract";
    private List<InputStreamEvent> inputStreamEventList;
    private List<FilterExpression> filterExpressionList;
    private List<StreamOutputAttribute> streamOutputAttributeList;
    private String outputStreamName;

    public List<InputStreamEvent> getInputStreamEventList() {
        return inputStreamEventList;
    }

    public void setInputStreamEventList(List<InputStreamEvent> inputStreamEventList) {
        this.inputStreamEventList = inputStreamEventList;
    }


    public List<FilterExpression> getFilterExpressionList() {
        return filterExpressionList;
    }

    public void setFilterExpressionList(List<FilterExpression> filterExpressionList) {
        this.filterExpressionList = filterExpressionList;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public List<StreamOutputAttribute> getStreamOutputAttributeList() {
        return streamOutputAttributeList;
    }

    public void setStreamOutputAttributeList(List<StreamOutputAttribute> streamOutputAttributeList) {
        this.streamOutputAttributeList = streamOutputAttributeList;
    }

    public String getOutputStreamName() {
        return outputStreamName;
    }

    public void setOutputStreamName(String outputStreamName) {
        this.outputStreamName = outputStreamName;
    }
}
