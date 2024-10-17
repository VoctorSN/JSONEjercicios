package edu.badpals.music.Games;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class GuardadorGame {
    public static void main(String[] args) {
        List<Game> juegos = new ArrayList<>();

        Game juego1 = new Game("The Witcher 3: Wild Hunt");
        juego1.setDescripcion("The Witcher 3 es un juego de rol de mundo abierto ambientado en un impresionante mundo de fantasía. Controlas a Geralt de Rivia, un cazador de monstruos conocido como un brujo, mientras navegas por un vasto continente lleno de misterio y peligro.");
        juego1.setVersion("1.2");
        juego1.addImagen("https://example.com/witcher3_screenshot1.jpg");
        juego1.addLenguaje("Español");

        Game juego2 = new Game("Red Dead Redemption 2");
        juego2.setDescripcion("Red Dead Redemption 2 es un épico juego de acción y aventuras ambientado en el salvaje oeste americano. Sigues la historia de Arthur Morgan, un forajido en una banda de forajidos, mientras luchan por sobrevivir en una era de cambios y modernización.");
        juego2.setVersion("1.1.1");
        juego2.addImagen("https://example.com/rdr2_screenshot1.jpg");
        juego2.addLenguaje("Inglés");

        juegos.add(juego1);
        juegos.add(juego2);
        try (ObjectOutputStream escritor = new ObjectOutputStream(Files.newOutputStream(new File("games.bin").toPath()))) {
            for (Game game: juegos){
                escritor.writeObject(game);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
