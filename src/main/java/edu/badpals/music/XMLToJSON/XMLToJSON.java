package edu.badpals.music.XMLToJSON;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XMLToJSON {
    public static void main(String[] args) {


        try {
            XmlMapper xmlMapper = new XmlMapper();
            JsonNode node = xmlMapper.readTree(new File("src/main/resources/pokemon.xml"));
            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/pokedex.json"),node);



        }catch (IOException e){
            System.out.println("Error al leer el archivo.");
        }



    }
}