
package com.smartblockscep.server.api.aggregation;


import com.smartblockscep.server.api.SiddhiElement;
import com.smartblockscep.server.api.expression.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * With time period for Incremental Aggregation.
 */
public class Within implements SiddhiElement {

    private static final long serialVersionUID = 1L;
    private List<Expression> timeRange = new ArrayList<>(2);
    private int[] queryContextStartIndex;
    private int[] queryContextEndIndex;

    private Within(Expression start, Expression end) {
        timeRange.add(start);
        timeRange.add(end);
    }

    private Within(Expression pattern) {
        timeRange.add(pattern);
    }

    public static Within within(Expression start, Expression end) {
        return new Within(start, end);
    }

    public static Within within(Expression pattern) {
        return new Within(pattern);
    }

    public List<Expression> getTimeRange() {
        return timeRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Within within = (Within) o;

        return timeRange != null ? timeRange.equals(within.timeRange) : within.timeRange == null;
    }

    @Override
    public int hashCode() {
        return timeRange != null ? timeRange.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Within{" +
                "timeRange=" + timeRange +
                '}';
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
}
