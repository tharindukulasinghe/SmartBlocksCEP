package com.smartblockscep.server;

import java.util.List;

public class SmartContract {

    private String version = "0.1.2";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "DataQualityContract";

    private List<StreamAttribute> attributes;

    private String expression;

    private List<String> inputs;

    public List<StreamOutputAttribute> getOutAttributes() {
        return outAttributes;
    }

    public void setOutAttributes(List<StreamOutputAttribute> outAttributes) {
        this.outAttributes = outAttributes;
    }

    private List<StreamOutputAttribute> outAttributes;

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
}
