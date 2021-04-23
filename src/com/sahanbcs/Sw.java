package com.sahanbcs;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sahanbcs.models.sample.SampleRes;
import sun.net.www.http.HttpClient;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Sw {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8880/sms");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("accept", "application/json");
        connection.setDoOutput(true);

        String jsonInputString =  "{\"name\":\"sahan\" , \"age\":\"3\"}";
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
        }

//        InputStream responseStream = connection.getInputStream();
//
//
//        ObjectMapper mapper = new ObjectMapper();
//        SampleRes str=null;
//
//        try {
//            System.out.println("JJJJJJJJJJJJJJJJ");
//            str = mapper.readValue(responseStream , SampleRes.class );
//        } catch (JsonMappingException e) {
//            e.printStackTrace();
//        }
//        System.out.println("The Res "  + str.getStatus() );

    }

}
