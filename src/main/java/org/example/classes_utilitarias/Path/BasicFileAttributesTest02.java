package org.example.classes_utilitarias.Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("folder2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime fileTime = basicFileAttributes.creationTime();
        FileTime fileTime1 = basicFileAttributes.lastAccessTime();
        FileTime fileTime2 = basicFileAttributes.lastModifiedTime();

        System.out.println("creation time " + fileTime);
        System.out.println("last access time " + fileTime1);
        System.out.println("last modifier " + fileTime2);

        Files.getFileAttributeView(path, BasicFileAttributeView.class);

    }
}
