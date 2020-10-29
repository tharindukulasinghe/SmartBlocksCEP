package com.smartblockscep.server.test;

import com.smartblockscep.server.InputStreamEvent;
import com.smartblockscep.server.QueryType;
import com.smartblockscep.server.StreamOutputAttribute;

import java.util.List;

public class SolidityContract {

    private QueryType queryType;
    private List<InputStreamEvent> inputStreamEventList;
    private List<FilterExpression> filterExpressionList;
    private List<StreamOutputAttribute> streamOutputAttributeList;
    private String outputStreamName;
    private List<WindowFunction> windowFunctionList;
    private List<WindowExpression> windowExpressionList;

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
        return "0.1.2";
    }

    public String getName() {
        return "DataQualityContract";
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


    public List<WindowFunction> getWindowFunctionList() {
        return windowFunctionList;
    }

    public void setWindowFunctionList(List<WindowFunction> windowFunctionList) {
        this.windowFunctionList = windowFunctionList;
    }

    public List<WindowExpression> getWindowExpressionList() {
        return windowExpressionList;
    }

    public void setWindowExpressionList(List<WindowExpression> windowExpressionList) {
        this.windowExpressionList = windowExpressionList;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryType queryType) {
        this.queryType = queryType;
    }
}
