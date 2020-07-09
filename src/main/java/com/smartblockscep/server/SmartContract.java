package com.smartblockscep.server;

import java.util.List;

public class SmartContract {

    private String version = "0.1.2";
    private String name = "DataQualityContract";
    private String inputStreamName;
    private String outputStreamName;
    private List<StreamAttribute> attributes;
    private List<StreamOutputAttribute> outAttributes;
    private String expression;
    private List<String> inputs;
    private boolean hasFilter;
    private boolean hasNoFilter;
    private int windowLength;

    public String getOutputStreamName() {
        return outputStreamName;
    }

    public void setOutputStreamName(String outputStreamName) {
        this.outputStreamName = outputStreamName;
    }

    public boolean isHasNoFilter() {
        return hasNoFilter;
    }

    public void setHasNoFilter(boolean hasNoFilter) {
        this.hasNoFilter = hasNoFilter;
    }

    public String getInputStreamName() {
        return inputStreamName;
    }

    public void setInputStreamName(String inputStreamName) {
        this.inputStreamName = inputStreamName;
    }

    public boolean isHasFilter() {
        return hasFilter;
    }

    public void setHasFilter(boolean hasFilter) {
        this.hasFilter = hasFilter;
    }

    public List<StreamOutputAttribute> getOutAttributes() {
        return outAttributes;
    }

    public void setOutAttributes(List<StreamOutputAttribute> outAttributes) {
        this.outAttributes = outAttributes;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<String> getInputs() {
        return inputs;
    }

    public void setInputs(List<String> inputs) {
        this.inputs = inputs;
    }

    public void setAttributes(List<StreamAttribute> attributes) {
        this.attributes = attributes;
    }

    public List<StreamAttribute> getAttributes() {
        return this.attributes;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWindowLength(){return windowLength;}

    public void setWindowLength(int windowLength){this.windowLength=windowLength;}
}
