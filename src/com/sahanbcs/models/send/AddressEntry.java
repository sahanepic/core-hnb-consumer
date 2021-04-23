package com.sahanbcs.models.send;

public class AddressEntry {

    private String address;
    private String timeStamp;
    private String messageId;
    private String statusCode;
    private String statusDetail;
    private String operator;


    public AddressEntry( ) {
    }

    public AddressEntry(String address, String timeStamp, String messageId, String statusCode, String statusDetail, String operator) {
        this.address = address;
        this.timeStamp = timeStamp;
        this.messageId = messageId;
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
        this.operator = operator;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

