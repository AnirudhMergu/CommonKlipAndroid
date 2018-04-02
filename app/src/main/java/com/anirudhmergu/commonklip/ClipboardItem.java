package com.anirudhmergu.commonklip;

public class ClipboardItem {
    private String data;
    private String Time;
    private String device;
    private String datatype;

    public ClipboardItem(String data, String time, String device, String datatype) {

        this.data = data;
        Time = time;
        this.device = device;
        this.datatype = datatype;
    }

    public String getData() {

        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }
}
