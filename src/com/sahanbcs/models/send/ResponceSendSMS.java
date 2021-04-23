package com.sahanbcs.models.send;

import java.util.List;

public class ResponceSendSMS {
    private  String version;
    private String requestId;
    private String statusCode;
    private String statusDetail;
    private List<AddressEntry> destinationResponses;

    public ResponceSendSMS( ) {
    }

    public ResponceSendSMS(String version, String requestId, String statusCode, String statusDetail, List<AddressEntry> destinationResponses) {
        this.version = version;
        this.requestId = requestId;
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
        this.destinationResponses = destinationResponses;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public List<AddressEntry> getDestinationResponses() {
        return destinationResponses;
    }

    public void setDestinationResponses(List<AddressEntry> destinationResponses) {
        this.destinationResponses = destinationResponses;
    }

    @Override
    public String toString() {
        return "ResponceSendSMS{" +
                "version='" + version + '\'' +
                ", requestId='" + requestId + '\'' +
                ", statusCode='" + statusCode + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                ", destinationResponses=" + destinationResponses +
                '}';
    }
}
