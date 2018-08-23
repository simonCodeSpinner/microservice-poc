package com.simon.discovery;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@Service
public class OrderService {
    private static final String template = "Hello, %s!";
    private static final String baseUrl = "http://hipchat.com";
    private static final String chatHistoryUrl = "/v2/room/Hackaton%20Lunch%20App/history";



    public Order greeting(String name) {
        return new Order(String.format(template, name), String.format(template, name));
    }

    public List<Order> readChat() {
        JSONObject json = null;
        List<Order> orders = new LinkedList<>();
        try {
            HttpURLConnection httpcon = (HttpURLConnection) ((new URL(this.baseUrl + this.chatHistoryUrl).openConnection()));
            httpcon.setDoOutput(true);
            httpcon.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpcon.setRequestProperty("Accept", "application/json");
            httpcon.setRequestMethod("GET");
            httpcon.setRequestProperty("charset", "utf-8");
            httpcon.setRequestProperty ("Authorization", "Bearer bHDw5mAqwttu3Ft62VVCuvrOTVovKBZgEkWTgxcg");
            httpcon.connect();

            InputStream inStream = httpcon.getInputStream();
            json = new JSONObject(streamToString(inStream));

            httpcon.disconnect();

        } catch (Exception e) {
            //to do
        }

        JSONArray jsonArray = json.getJSONArray("items");
        JSONObject item;
        Object  user;
        for (int i = 0; i<jsonArray.length() ; i++){
            item = jsonArray.getJSONObject(i);
            if (item != null) {
                user = item.get("from");
                if ((user != null) && (user instanceof JSONObject)) {
                    String dish = (String) item.get("message");
                    if ((dish != null) && (dish.contains("@lunch"))) {
                        String hungry = (String) ((JSONObject) user).get("name");
                        Order order = new Order(dish, hungry);
                        orders.add(order);
                    }
                }
            }
        }

        return orders;
    }

    private static String streamToString(InputStream inputStream) {
        String text = new Scanner(inputStream, "UTF-8").useDelimiter("\\Z").next();
        return text;
    }
}