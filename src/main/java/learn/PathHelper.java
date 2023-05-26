package learn;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathHelper {
    public static void main(String[] args) throws IOException {
        Path fichier = FileSystems.getDefault().getPath("/Users/maxim/Desktop/Dev/Java/learn/demo.js");
        Path file = Files.createFile(fichier);
//        System.out.println(file);

    }
}
