package com.sahanbcs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sahanbcs.models.Enmorators.DiliveryStatus;
import com.sahanbcs.models.Enmorators.Encoding;
import com.sahanbcs.models.Enmorators.RDiliveryStatus;
import com.sahanbcs.models.delivey.RequestDiliveryStatusReport;
import com.sahanbcs.models.send.RequestSendSMS;
import com.sahanbcs.models.send.ResponceSendSMS;
import com.sahanbcs.services.Connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class StatusDilivery {

    public static void main(String[] args) throws IOException {

//        URL url = new URL("http://localhost:8880/smsdiliverystatusreport");
//        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//        connection.setRequestProperty("Content-Type", "application/json; utf-8");
//        connection.setRequestProperty("accept", "application/json");
//        connection.setDoOutput(true);

        HttpURLConnection connection = Connection.getSmsStatusDiliveryConnection();

//        String jsonInputString =  "{\"name\":\"sahan\" , \"age\":\"3\"}";

        List<String> sse = new ArrayList<String>();
        sse.add("tel:94774747447 ");

        RequestDiliveryStatusReport rr = new RequestDiliveryStatusReport("tel:94774747447", "20120113082110", "MSG_000111", RDiliveryStatus.DELIVERED);
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
