package com.smartblockscep.server.test;

import com.smartblockscep.server.*;

import java.util.ArrayList;
import java.util.List;

public class WindowFunction {
    private String windowName;
    private List<AverageFunction> averageFunctions = new ArrayList<>();
    private List<SumFunction> sumFunctions = new ArrayList<>();
    private List<MaxFunction> maxFunctions = new ArrayList<>();
    private List<MinFunction> minFunctions = new ArrayList<>();
    private List<CountFunction> countFunctions = new ArrayList<>();
    private int windowLength;

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }

    public List<AverageFunction> getAverageFunctions() {
        return averageFunctions;
    }

    public void setAverageFunctions(List<AverageFunction> averageFunctions) {
        this.averageFunctions = averageFunctions;
    }

    public List<SumFunction> getSumFunctions() {
        return sumFunctions;
    }

    public void setSumFunctions(List<SumFunction> sumFunctions) {
        this.sumFunctions = sumFunctions;
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

    public int getWindowLength() {
        return windowLength;
    }

    public void setWindowLength(int windowLength) {
        this.windowLength = windowLength;
    }

    public void addAverageFunction(AverageFunction averageFunction) {
        this.averageFunctions.add(averageFunction);
    }

    public void addSumFunction(SumFunction sumFunction) {
        this.sumFunctions.add(sumFunction);
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
}
