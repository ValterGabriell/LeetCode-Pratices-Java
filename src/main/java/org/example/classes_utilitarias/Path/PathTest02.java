package org.example.classes_utilitarias.Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder");
        if (Files.notExists(path)){
//            Path directory = Files.createDirectory(path);
        }
        Path subPath = Paths.get("folder/foldersub/subpasta");
        Path subDirectory = Files.createDirectories(subPath);
        Path filePath = Paths.get(subPath.toString(), "file.txt");
        if (Files.notExists(filePath)){
            Path filePathCreated = Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);


    }
}
