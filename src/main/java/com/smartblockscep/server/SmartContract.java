package com.smartblockscep.server;

import java.util.ArrayList;
import java.util.List;

public class SmartContract {

    private QueryType queryType;
    private String version = "0.1.2";
    private String name = "DataQualityContract";
    private String inputStreamName;
    private List<InputStreamEvent> inputStreamEventList;
    private String outputStreamName;
    private List<StreamAttribute> attributes;
    private List<StreamOutputAttribute> outAttributes;
    private String expression;
    private List<String> inputs;
    private boolean hasFilter;
    private boolean hasNoFilter;
    private int windowLength;
    private boolean averageFunction = false;
    private List<AverageFunction> averageFunctions = new ArrayList<>();
    private List<SumFunction> sumFunctions = new ArrayList<>();
    private List<MaxFunction> maxFunctions = new ArrayList<>();
    private List<MinFunction> minFunctions = new ArrayList<>();
    private List<CountFunction> countFunctions = new ArrayList<>();
    private List<MaxForeverFunction> maxForeverFunctions = new ArrayList<>();
    private List<MinForeverFunction> minForeverFunctions = new ArrayList<>();

    public boolean isHasHaving() {
        return hasHaving;
    }

    public void setHasHaving(boolean hasHaving) {
        this.hasHaving = hasHaving;
    }

    public boolean isHasNoHaving() {
        return hasNoHaving;
    }

    public void setHasNoHaving(boolean hasNoHaving) {
        this.hasNoHaving = hasNoHaving;
    }

    private boolean hasHaving;
    private boolean hasNoHaving;

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

    public List<InputStreamEvent> getInputStreamEventList(){return inputStreamEventList;}

    public void setInputStreamEventList(List<InputStreamEvent> inputStreamEventList){this.inputStreamEventList = inputStreamEventList;}

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

    public int getWindowLength() {
        return windowLength;
    }

    public void setWindowLength(int windowLength) {
        this.windowLength = windowLength;
    }

    public boolean isAverageFunction() {
        return averageFunction;
    }

    public void setAverageFunction(boolean averageFunction) {
        this.averageFunction = averageFunction;
    }

    public List<AverageFunction> getAverageFunctions() {
        return averageFunctions;
    }

    public void setAverageFunctions(List<AverageFunction> averageFunctions) {
        this.averageFunctions = averageFunctions;
    }

    public void addAverageFunction(AverageFunction averageFunction) {
        this.averageFunctions.add(averageFunction);
    }

    public List<SumFunction> getSumFunctions() {
        return sumFunctions;
    }

    public void setSumFunctions(List<SumFunction> sumFunctions) {
        this.sumFunctions = sumFunctions;
    }

    public void addSumFunction(SumFunction sumFunction) {
        this.sumFunctions.add(sumFunction);
    }

    public List<MaxFunction> getMaxFunctions() {
        return maxFunctions;
    }

    public void setMaxFunctions(List<MaxFunction> maxFunctions) {
        this.maxFunctions = maxFunctions;
    }

    public List<MinFunction> getMinFunctions() {
        return minFunctions;
    }

    public void setMinFunctions(List<MinFunction> minFunctions) {
        this.minFunctions = minFunctions;
    }

    public List<CountFunction> getCountFunctions() {
        return countFunctions;
    }

    public void setCountFunctions(List<CountFunction> countFunctions) {
        this.countFunctions = countFunctions;
    }

    public void addMaxFunction(MaxFunction maxFunction) {
        this.maxFunctions.add(maxFunction);
    }

    public void addMinFunction(MinFunction minFunction) {
        this.minFunctions.add(minFunction);
    }

    public void addCountFunction(CountFunction countFunction) {
        this.countFunctions.add(countFunction);
    }

    public void addMaxForeverFunction(MaxForeverFunction maxForeverFunction) {
        this.maxForeverFunctions.add(maxForeverFunction);
    }

    public List<MaxForeverFunction> getMaxForeverFunctions() {
        return maxForeverFunctions;
    }

    public void setMaxForeverFunctions(List<MaxForeverFunction> maxForeverFunctions) {
        this.maxForeverFunctions = maxForeverFunctions;
    }

    public void addMinForeverFunction(MinForeverFunction minForeverFunction) {
        this.minForeverFunctions.add(minForeverFunction);
    }

    public List<MinForeverFunction> getMinForeverFunctions() {
        return minForeverFunctions;
    }

    public void setMinForeverFunctions(List<MinForeverFunction> minForeverFunctions) {
        this.minForeverFunctions = minForeverFunctions;
    }
}
