package edu.badpals.music.Games;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GameToJson {

    public static void main(String[] args) {
        BinToJson("games.bin");
    }

    public static void BinToJson(String path) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("games.json"),lectorDeBinario("games.bin"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<Game> lectorDeBinario(String path) {
        List<Game> games = new ArrayList<>();
        try(ObjectInputStream lector = new ObjectInputStream(new FileInputStream(path))){

            while(true){
                games.add((Game) lector.readObject());
            }
        } catch (Exception e) {
            return games;
        }
    }
}
