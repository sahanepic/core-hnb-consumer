package com.sahanbcs.services;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connection {


    public static HttpURLConnection getSmsSendConnection() throws IOException {
        URL url = new URL("http://localhost:8880/smssend");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("accept", "application/json");
        connection.setDoOutput(true);

        return connection;
    }

    public static HttpURLConnection getSmsReciveConnection() throws IOException {
    URL url = new URL("http://localhost:8880/smsrecive");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("accept", "application/json");
        connection.setDoOutput(true);
        return connection;
    }

    public static HttpURLConnection getSmsStatusDiliveryConnection() throws IOException {
    URL url = new URL("http://localhost:8880/smsdiliverystatusreport");
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("Content-Type", "application/json; utf-8");
        connection.setRequestProperty("accept", "application/json");
        connection.setDoOutput(true);
        return connection;
    }
}
