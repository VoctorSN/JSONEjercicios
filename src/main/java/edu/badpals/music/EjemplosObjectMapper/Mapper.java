package edu.badpals.music.EjemplosObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Mapper {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = new Person("Alice", 25);
            String json = objectMapper.writeValueAsString(person);

            System.out.println("JSON: " + json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}