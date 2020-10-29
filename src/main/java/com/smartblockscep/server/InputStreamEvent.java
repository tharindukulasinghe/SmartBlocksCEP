package com.smartblockscep.server;

import java.util.ArrayList;
import java.util.List;

public class InputStreamEvent {
    private String inputStreamName;
    private List<String> referenceIds = new ArrayList<>();
    private List<StreamAttribute> streamAttributeList = new ArrayList<>();

    public String toString() {
        return "InputStreamEvent{" +
                "inputStreamName=" + inputStreamName +", "+
                "referenceIds=" + referenceIds +", "+
                "streamAttributeList=" + streamAttributeList +" "+
                '}';
    }

    public String getInputStreamName() {
        return this.inputStreamName;
    }

    public void setInputStreamName(String inputStreamName) {
        this.inputStreamName = inputStreamName;
    }

    public List<StreamAttribute> getStreamAttributeList() {
        return this.streamAttributeList;
    }

    public void setStreamAttributeList(List<StreamAttribute> streamAttributeList) {
        this.streamAttributeList = streamAttributeList;
    }


    public List<String> getReferenceIds() {
        return referenceIds;
    }

    public void setReferenceIds(List<String> referenceIds) {
        this.referenceIds = referenceIds;
    }

    public void addStreamReferenceId(String referenceId) {
        this.referenceIds.add(referenceId);
    }
}
