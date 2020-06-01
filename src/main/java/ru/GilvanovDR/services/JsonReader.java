/*
 * GilvanovDR (c) 2020.
 */

package ru.GilvanovDR.services;

import org.codehaus.jackson.map.ObjectMapper;
import ru.GilvanovDR.model.JsonEntity;

import java.io.IOException;
import java.net.URL;

public class JsonReader {
    public static JsonEntity readJsonFromUrl(String url) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new URL(url), JsonEntity.class);
        } catch (IOException e) {
            System.out.println(e.getMessage() + " to " + url);
        }
        return null;
    }
}

