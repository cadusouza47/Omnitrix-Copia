package br.com.first.projeto.tela.java;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Monday {
    
    private static final String URL = "https://api.monday.com/v2";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final Integer BOARD_ID = 1295845377;
    private static final String KEY = "eyJhbGciOiJIUzI1NiJ9.eyJ0aWQiOjExMDA5MjU0OSwidWlkIjoxODA2NDQyNSwiaWFkIjoiMjAyMS0wNS0xNFQyMzowNDo1My4wMDBaIiwicGVyIjoibWU6d3JpdGUiLCJhY3RpZCI6NDQ5MTk5MCwicmduIjoidXNlMSJ9.ApJk662Hwk_m9x4yInU1l63GAcfuBNENcG9_UwLsNtw";
    private static final String JSON_PATTERN = "{\"query\":\"mutation ($boardId: Int!, $groupId: String!, $itemName: String!) { create_item (board_id: $boardId, group_id: $groupId, item_name: $itemName) { id } }\", \"variables\": { \"boardId\": %d, \"groupId\": \"%s\", \"itemName\": \"%s\" } }";

    public static void createItem(final String groupId, final String itemName) throws IOException, InterruptedException {

        final HttpRequest request = HttpRequest.newBuilder(URI.create(URL))
                .header("Content-Type", "application/json")
                .header("Authorization", KEY)
                .POST(HttpRequest.BodyPublishers.ofString(
                    String.format(
                        JSON_PATTERN,
                        BOARD_ID, groupId, itemName)))
                .build();

        final HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(String.format("Status: %s", response.statusCode()));
        System.out.println(String.format("Response: %s", response.body()));
    }
}

