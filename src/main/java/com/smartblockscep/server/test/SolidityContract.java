package com.smartblockscep.server.test;

import com.smartblockscep.server.InputStreamEvent;
import com.smartblockscep.server.StreamOutputAttribute;

import java.util.ArrayList;
import java.util.List;

public class SolidityContract {

    private List<InputStreamEvent> inputStreamEventList = new ArrayList<>();
    private List<FilterExpression> filterExpressionList = new ArrayList<>();
    private List<StreamOutputAttribute> streamOutputAttributeList = new ArrayList<>();
    private String outputStreamName;
    private List<WindowFunction> windowFunctionList = new ArrayList<>();
    private List<WindowExpression> windowExpressionList = new ArrayList<>();
    private List<PatternExpression> patternExpressionList = new ArrayList<>();
    private List<SequenceExpression> sequenceExpressionList = new ArrayList<>();
    //todo find a better way
    private List<InitialInputStream> inputStreamNames=new ArrayList<>();
    private List<String> sequenceOutPuts=new ArrayList<>();

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

    public void addFilterExpression(FilterExpression filterExpression) {
        this.filterExpressionList.add(filterExpression);
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

    public List<PatternExpression> getPatternExpressionList() {
        return patternExpressionList;
    }

    public void setPatternExpressionList(List<PatternExpression> patternExpressionList) {
        this.patternExpressionList = patternExpressionList;
    }

    public void addPatternExpression(PatternExpression patternExpression) {
        this.patternExpressionList.add(patternExpression);
    }

    public List<SequenceExpression> getSequenceExpressionList() {
        return sequenceExpressionList;
    }

    public void setSequenceExpressionList(List<SequenceExpression> sequenceExpressionList) {
        this.sequenceExpressionList = sequenceExpressionList;
    }

    public void addSequenceExpression(SequenceExpression sequenceExpression){
        this.sequenceExpressionList.add(sequenceExpression);
    }

    public List<InitialInputStream> getInputStreamNames() {
        return inputStreamNames;
    }

    public void setInputStreamNames(List<InitialInputStream> inputStreamNames) {
        this.inputStreamNames = inputStreamNames;
    }

    public void addInputStreamName(InitialInputStream initialInputStream){
        this.inputStreamNames.add(initialInputStream);
    }

    public List<String> getSequenceOutPuts() {
        return sequenceOutPuts;
    }

    public void setSequenceOutPuts(List<String> sequenceOutPuts) {
        this.sequenceOutPuts = sequenceOutPuts;
    }

    public void addSequenceOutPuts(String output){
        this.sequenceOutPuts.add(output);
    }
}
