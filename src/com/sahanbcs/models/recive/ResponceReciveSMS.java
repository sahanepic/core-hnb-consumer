package com.sahanbcs.models.recive;

public class ResponceReciveSMS {

    private String statusCode;
    private String statusDetail;


    public ResponceReciveSMS( ) {
    }

    public ResponceReciveSMS(String statusCode, String statusDetail) {
        this.statusCode = statusCode;
        this.statusDetail = statusDetail;
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

    @Override
    public String toString() {
        return "ResponceReciveSMS{" +
                "statusCode='" + statusCode + '\'' +
                ", statusDetail='" + statusDetail + '\'' +
                '}';
    }
}
