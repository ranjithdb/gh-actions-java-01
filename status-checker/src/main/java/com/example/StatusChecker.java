package com.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class StatusChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java -jar status-checker-1.0-SNAPSHOT.jar <URL>");
            System.exit(1);
        }
        
        String url = args[0];
        try {
            int statusCode = getStatusCode(url);
            System.out.println("HTTP Status Code for " + url + ": " + statusCode);
        } catch (IOException e) {
            System.out.println("Error fetching URL: " + e.getMessage());
        }
    }
    
    public static int getStatusCode(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        return connection.getResponseCode();
    }
}