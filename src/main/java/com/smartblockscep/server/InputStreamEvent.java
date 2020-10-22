package com.smartblockscep.server;

import java.util.List;

public class InputStreamEvent {
    String inputStreamName;
    private List<StreamAttribute> streamAttributeList;


    public String getInputStreamName(){return this.inputStreamName;}

    public void setInputStreamName(String inputStreamName){this.inputStreamName=inputStreamName;}

    public List<StreamAttribute> getStreamAttributeList(){return this.streamAttributeList;}

    public void setStreamAttributeList(List<StreamAttribute> streamAttributeList){this.streamAttributeList=streamAttributeList;}
}
