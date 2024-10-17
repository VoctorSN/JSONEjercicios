package edu.badpals.music.EjemplosObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONCreator {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}";

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(json, Person.class);

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}