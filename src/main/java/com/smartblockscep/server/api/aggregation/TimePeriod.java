
package com.smartblockscep.server.api.aggregation;

import com.smartblockscep.server.api.SiddhiElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Time Period API. This defines all the time durations supported in Incremental Aggregation,
 * and the relevant operators
 */
public class TimePeriod implements SiddhiElement {

    private static final long serialVersionUID = 1L;
    private Operator operator;
    private List<Duration> durations;
    private int[] queryContextStartIndex;
    private int[] queryContextEndIndex;

    private TimePeriod(Operator operator) {
        this.durations = new ArrayList<>();
        this.operator = operator;
    }

    public static TimePeriod range(Duration begging, Duration end) { // range sec ... min
        TimePeriod timePeriod = new TimePeriod(Operator.RANGE);
        timePeriod.durations.add(begging);
        timePeriod.durations.add(end);
        return timePeriod;
    }

    public static TimePeriod interval(Duration... durations) { // interval sec, min, time
        TimePeriod timePeriod = new TimePeriod(Operator.INTERVAL);
        Collections.addAll(timePeriod.durations, durations);
        return timePeriod;
    }

    public Operator getOperator() {
        return this.operator;
    }

    public List<Duration> getDurations() {
        return this.durations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TimePeriod that = (TimePeriod) o;

        if (operator != that.operator) {
            return false;
        }
        return durations != null ? durations.equals(that.durations) : that.durations == null;
    }

    @Override
    public int hashCode() {
        int result = operator.hashCode();
        result = 31 * result + (durations != null ? durations.hashCode() : 0);
        return result;
    }

    @Override
    public int[] getQueryContextStartIndex() {
        return queryContextStartIndex;
    }

    @Override
    public void setQueryContextStartIndex(int[] lineAndColumn) {
        queryContextStartIndex = lineAndColumn;
    }

    @Override
    public int[] getQueryContextEndIndex() {
        return queryContextEndIndex;
    }

    @Override
    public void setQueryContextEndIndex(int[] lineAndColumn) {
        queryContextEndIndex = lineAndColumn;
    }

    /**
     * Durations supported in Incremental Aggregation
     */
    public enum Duration {
        SECONDS, MINUTES, HOURS, DAYS, MONTHS, YEARS
    }

    /**
     * Operators supported in Incremental Aggregation.
     * RANGE operator allows a range of time durations to be defined (e.g. sec ... year)
     * INTERVAL operator allows comma separated time durations to be specified (e.g. sec, month, year)
     */
    public enum Operator {
        RANGE, INTERVAL
    }
}
