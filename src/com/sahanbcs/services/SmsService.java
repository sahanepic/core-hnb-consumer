package com.sahanbcs.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sahanbcs.models.Enmorators.DiliveryStatus;
import com.sahanbcs.models.Enmorators.Encoding;
import com.sahanbcs.models.send.RequestSendSMS;
import com.sahanbcs.models.send.ResponceSendSMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

public class SmsService {


    public static void sendSms(List<String> sse ,String msg) throws IOException {


        HttpURLConnection connection = Connection.getSmsSendConnection();



        RequestSendSMS rr = new RequestSendSMS("APP_999999", "password", "1.0", sse, msg, "77000", DiliveryStatus.DELIVERYREPORTREQUIRED, Encoding.Binarysms, 15.75);
        ObjectMapper mapper = new ObjectMapper();
        String jsonInputString = mapper.writeValueAsString(rr);


        try(OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }


        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());

            ResponceSendSMS nn = mapper.readValue(response.toString(),ResponceSendSMS.class);

            System.out.println( "The Out Put \n\t"  +nn.toString());
        }


    }

}
