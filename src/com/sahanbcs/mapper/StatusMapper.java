package com.sahanbcs.mapper;

public class StatusMapper {


    public static Boolean  statusSuccess(String in){
        Boolean out= false;
        switch (in){
            case "S1000":
            case "P1001":
            case "P1002":
                out = true;
                break;
            default:
                out = false;
                break;
        }
        return out;
    }


        public static String statusMapper(String in){
            String out= null;
            switch (in){
                case  "S1000":
                    out = "Process completed successfully for all the available destination numbers.";
                    break;
                case  "P1001":
                    out = "Request processed successfully, but delivery to some destinations have failed. Please check the individual status for more details.";
                    break;
                case  "P1002":
                    out = "Message contains suspected abusive content or subscriber base is larger than limit. Message will be stored for admin approval.";
                    break;
                case  "E1313":
                    out = "Authentication failed. No such active application with applicationId <application-id>, or no active service provider or the given password in the request is invalid.";
                    break;
                case  "E1303":
                    out = "IP address from which this request originated is not provisioned to send request to application <application-id>. Please use a provisioned system to send request or contact system admin to provision the new IP.";
                    break;
                case  "E1312":
                    out = "Request is Invalid. <specify_the_reason> Refer the SMS and USSD Gateway NBL API Developer Guide for the mandatory fields and correct format of the request.";
                    break;
                case  "E1309":
                    out = "Requested SMS service is not allowed for this Application. Please check the issue with SMS and USSD Gateway system administrator.";
                    break;
                case  "E1311":
                    out = "Mobile terminated SMS messages have not enabled. Check your NCS configuration in provisioning.";
                    break;
                case  "E1315":
                    out = "Cannot find the requested service SMS or it is not active.";
                    break;
                case  "E1341":
                    out = "Request failed. Errors occurred while sending the request for all the destinations.";
                    break;
                case  "E1334":
                    out = "SMS sent to <application name> application could not be processed as the message length is too long. Maximum message length allowed is <specify_max_limit>";
                    break;
                case  "E1335":
                    out = "SMS sent to <application name> application could not be processed as the advertisement message length is too long. Maximum message length allowed for advertisements is <specify_max_adv_limit>";
                    break;
                case  "E1601":
                    out = "System experienced an unexpected error.";
                    break;
                case  "E1342":
                    out = "MSISDN is black listed. Not authorized to use the application <application_name>";
                    break;
                case  "E1343":
                    out = "MSISDN is not white listed. Only white list numbers are allowed to send messages at this state.";
                    break;
                case  "E1325":
                    out = "Format of the address is invalid. Expected format is \"tel:94771211212\"";
                    break;
                case  "E1331":
                    out = "<sourceAddress> is not allowed. Please use one of the values configured in alias configuration in the SLAs or send the request without <sourceAddress>, so SMS and USSD Gateway will use the default source address to send the message to subscriber.";
                    break;
                case  "E1308":
                    out = "Permanent charging error due <specify_reason E.g., Insufficient Balance>.";
                    break;
                case  "E1318":
                    out = "Transaction limit per second has exceeded. Please throttle requests not to exceed the transaction limit. Contact SMS and USSD Gateway admin to increase the traffic limit.";
                    break;

                case  "E1319":
                    out = "Transaction limit for today is exceeded. Please try again tomorrow or contact SMS and USSD Gateway admin to increase the transaction per day limit";
                    break;
                case  "E1326":
                    out = "Insufficient balance.";
                    break;
                case  "E1602":
                    out = "Message delivery failed. Please retry";
                    break;
                case  "E1603":
                    out = "Temporary System Error occurred while delivering your request.";
                    break;
                default:
                    out= "no Mapping";
                    break;
            }
            return out;
        }

}
