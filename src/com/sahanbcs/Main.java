package com.sahanbcs;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sahanbcs.models.sample.SampleRes;
import com.sun.deploy.net.HttpResponse;
import sun.net.www.http.HttpClient;


import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
//             System.out.println("Hello sahan");

        URL url = new URL("http://localhost:8880/nn");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestProperty("accept", "application/json");

        InputStream responseStream = connection.getInputStream();


        ObjectMapper mapper = new ObjectMapper();
        SampleRes str=null;

        try {
            System.out.println("JJJJJJJJJJJJJJJJ");
            str = mapper.readValue(responseStream , SampleRes.class );
        } catch (JsonMappingException e) {
            e.printStackTrace();
        }
        System.out.println("The Res "  + str.getStatus() );

    }

}
