package com.sahanbcs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sahanbcs.models.Enmorators.DiliveryStatus;
import com.sahanbcs.models.Enmorators.Encoding;
import com.sahanbcs.models.recive.RequestReciveSMS;
import com.sahanbcs.models.recive.ResponceReciveSMS;
import com.sahanbcs.models.send.RequestSendSMS;
import com.sahanbcs.models.send.ResponceSendSMS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class smsRecive {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://localhost:8880/smsrecive");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("accept", "application/json");
        connection.setDoOutput(true);

//        String jsonInputString =  "{\"name\":\"sahan\" , \"age\":\"3\"}";



        RequestReciveSMS rr = new RequestReciveSMS("1.0","23112" ,"tel:94777323654","my testing message from app1","APP_000001",Encoding.Text);
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

            ResponceReciveSMS nn = mapper.readValue(response.toString(),ResponceReciveSMS.class);

            System.out.println( "The Out Put \n\t"  +nn.toString());
        }

    }
}
