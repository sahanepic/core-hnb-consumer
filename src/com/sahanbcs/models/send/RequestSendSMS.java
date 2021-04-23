package com.sahanbcs.models.send;

//import com.sahanbcs.sms.model.Enomorators.Encoding;

import com.sahanbcs.models.Enmorators.DiliveryStatus;
import com.sahanbcs.models.Enmorators.Encoding;

//import javax.validation.constraints.NotBlank;
import java.util.List;

public class RequestSendSMS {

//    @NotBlank
    private String applicationId;
//    @NotBlank
    private String password;

    private String version;

//    @Min.List(@Min(1))
    private List<String>  destinationAddresses;

//    @NotBlank
    private String message;
    private String sourceAddress;

    private DiliveryStatus deliveryStatusRequest;
    private Encoding encoding;
//    private String deliveryStatusRequest;
//    private String encoding;
    private double chargingAmount;



    public RequestSendSMS( ) {

    }

    public RequestSendSMS(String applicationId, String password, String version, List<String> destinationAddresses, String message, String sourceAddress, DiliveryStatus deliveryStatusRequest, Encoding encoding, double chargingAmount) {
        this.applicationId = applicationId;
        this.password = password;
        this.version = version;
        this.destinationAddresses = destinationAddresses;
        this.message = message;
        this.sourceAddress = sourceAddress;
        this.deliveryStatusRequest = deliveryStatusRequest;
        this.encoding = encoding;
        this.chargingAmount = chargingAmount;
    }


    public List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    public void setDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

//    public RequestSendSMS(String applicationId, String password, String version, List<String> destinationAddresses, String message, String sourceAddress, String deliveryStatusRequest, String encoding, double chargingAmount) {
//        this.applicationId = applicationId;
//        this.password = password;
//        this.version = version;
//        this.destinationAddresses = destinationAddresses;
//        this.message = message;
//        this.sourceAddress = sourceAddress;
//        this.deliveryStatusRequest = deliveryStatusRequest;
//        this.encoding = encoding;
//        this.chargingAmount = chargingAmount;
//    }

//    public String getDeliveryStatusRequest() {
//        return deliveryStatusRequest;
//    }
//
//    public void setDeliveryStatusRequest(String deliveryStatusRequest) {
//        this.deliveryStatusRequest = deliveryStatusRequest;
//    }
//
//    public String getEncoding() {
//        return encoding;
//    }
//
//    public void setEncoding(String encoding) {
//        this.encoding = encoding;
//    }

    //    public String getDiliveryStatus() {
//        return diliveryStatus;
//    }
//
//    public void setDiliveryStatus(String diliveryStatus) {
//        this.diliveryStatus = diliveryStatus;
//    }
//
//    public String getEncoding() {
//        return encoding;
//    }
//
//    public void setEncoding(String encoding) {
//        this.encoding = encoding;
//    }


    public String getDeliveryStatusRequest() {
        return deliveryStatusRequest.getText();
    }

    public void setDeliveryStatusRequest(DiliveryStatus deliveryStatusRequest) {
        this.deliveryStatusRequest = deliveryStatusRequest;
    }

    public String getEncoding() {
        return encoding.getText();
    }

    public void setEncoding(Encoding encoding) {
        this.encoding = encoding;
    }

    public double getChargingAmount() {
        return chargingAmount;
    }

    public void setChargingAmount(double chargingAmount) {
        this.chargingAmount = chargingAmount;
    }

    @Override
    public String toString() {
        return "RequestSendSMS{" +
                "applicationId='" + applicationId + '\'' +
                ", password='" + password + '\'' +
                ", version='" + version + '\'' +
                ", destinationAddresses=" + destinationAddresses +
                ", message='" + message + '\'' +
                ", sourceAddress='" + sourceAddress + '\'' +
                ", diliveryStatus=" + deliveryStatusRequest +
                ", encoding=" + encoding +
                ", chargingAmount=" + chargingAmount +
                '}';
    }
}
